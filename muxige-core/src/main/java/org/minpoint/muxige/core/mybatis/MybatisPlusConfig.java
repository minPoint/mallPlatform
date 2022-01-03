package org.minpoint.muxige.core.mybatis;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @ClassName MybatisPlusConfig
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/23 23:33
 */
@Configuration
//@MapperScan("org.minpoint.muxige.*.core.mapper.*")//这个注解，作用相当于下面的@Bean MapperScannerConfigurer，2者配置1份即可
public class MybatisPlusConfig {

    /**
     * 自定义sql注入器
     * 或者application.properties配置：
     * mybatis-plus.globalConfig.sqlInjector=com.javasgj.springboot.mybatisplus.config.GeneralMybatisPlusSqlInjector
     */
    @Bean
    public ISqlInjector iSqlInjector() {
        return new MySqlInjector();
    }
}
