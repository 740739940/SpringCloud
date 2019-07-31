package com.zz.servicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ServiceZuulApplication {
    /**
     * zuul功能：
     *  1.路由转发 yml配置
     *  2.过滤器功能，继承zuulFilter重写方法
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

}
