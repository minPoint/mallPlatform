package org.minpoint.muxige.core.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.minpoint.muxige.core.page.ListData;
import org.minpoint.muxige.core.pojo.MuXiGeResponse;
import org.minpoint.muxige.utils.DateTimeUtils;
import org.minpoint.muxige.utils.JsonUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/*
 * @ClassName MuXiGeControllerAop
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2022/1/3 20:07
 */
@Aspect
@Component
@Slf4j
public class MuXiGeControllerAop {
    @Pointcut("execution(public * org.minpoint.muxige.*.controller..*.*(..))")
    public void controllerAop(){};


    @Around("controllerAop()")
    public Object aroundHandler(ProceedingJoinPoint joinPoint){
        // 请求时间
        long reqTime = DateTimeUtils.currentTimeMillis();

        String currentName = Thread.currentThread().getName();
        Thread.currentThread().setName(currentName + reqTime);


        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Signature signature = joinPoint.getSignature();
        //MethodSignature paramSignature = ((MethodSignature) signature);
        //Object[] params = joinPoint.getArgs();
        log.info("【请求】时间：{} ip：{} 路径：{} 方式：{}",
                DateTimeUtils.currentDayStartTimeStamp(), request.getRemoteAddr(), request.getRequestURI()
                , request.getMethod());

        MuXiGeResponse muXiGeResponse = null;
        try {
            Object proceed = joinPoint.proceed();
            if(proceed instanceof MuXiGeResponse){
                muXiGeResponse = (MuXiGeResponse) proceed;
            }
            else{
                muXiGeResponse = MuXiGeResponse.create(proceed);
            }
        }catch (Throwable e){
            muXiGeResponse = MuXiGeResponse.error(JsonUtils.toJson(e));
            log.error("【请求】",e);
        }finally {
            long constTime = DateTimeUtils.currentTimeMillis() - reqTime;
            log.info("【请求】constTime：{}", constTime);
            muXiGeResponse.setCostTime(constTime);
        }

        return muXiGeResponse;
    }
}
