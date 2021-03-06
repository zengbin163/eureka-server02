package com.chihuo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 标识是eureka服务端
public class StartEurekaServer02Application {
	public static void main(String[] args) {
		SpringApplication.run(StartEurekaServer02Application.class, args);
	}
}
