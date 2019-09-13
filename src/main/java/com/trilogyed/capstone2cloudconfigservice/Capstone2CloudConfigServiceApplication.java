package com.trilogyed.capstone2cloudconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Capstone2CloudConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Capstone2CloudConfigServiceApplication.class, args);
	}

}
