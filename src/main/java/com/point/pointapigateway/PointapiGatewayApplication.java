package com.point.pointapigateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,})
@EnableDubbo
@Service
@EnableDiscoveryClient
public class PointapiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointapiGatewayApplication.class, args);
    }

}
