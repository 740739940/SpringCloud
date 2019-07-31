package com.zz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zz.module.user.mapper")
public class ScServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScServerApplication.class, args);
    }

}
