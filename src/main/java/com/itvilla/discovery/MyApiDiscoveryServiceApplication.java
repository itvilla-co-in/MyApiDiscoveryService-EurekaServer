package com.itvilla.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyApiDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApiDiscoveryServiceApplication.class, args);
	}

}
