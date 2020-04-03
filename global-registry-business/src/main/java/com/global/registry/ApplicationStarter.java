package com.global.registry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 鲁砚琨
 * @CreateTime: 2020-04-02 下午 03:47
 * @Version: v1.0
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class ApplicationStarter extends SpringBootServletInitializer {


    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationStarter.class);
    }

    public static void main(String[] args) {
        log.info("启动服务......");
        SpringApplication.run(ApplicationStarter.class);
        log.info("启动完成......");
    }
}
