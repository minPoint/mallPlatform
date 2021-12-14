package org.minpoint.muxige;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @ClassName UnionPlatform
 * @Description
 * @author BabyBlackSkin
 * @version 1.00
 * @since 2021/12/5 20:47
 */
@SpringBootApplication
//@MapperScans({@MapperScan("org.minpoint.muxige.store.core.mapper.*"),MapperScan("org.minpoint.muxige..core.mapper.*")})
public class UnionPlatform {

    public static void main(String[] args) {
        SpringApplication.run(UnionPlatform.class);
    }
}
