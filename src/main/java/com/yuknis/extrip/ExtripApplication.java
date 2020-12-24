package com.yuknis.extrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExtripApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExtripApplication.class, args);
	}

}
