package com.chihuo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 标识是eureka服务端
public class StartApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}
