package com.zhixi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhixi.mapper")
public class MybatisQuery111nNnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisQuery111nNnApplication.class, args);
    }

}
