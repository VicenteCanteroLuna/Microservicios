package com.bosonit.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}

//https://www.youtube.com/watch?v=ydtswONk9TE&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW&index=12