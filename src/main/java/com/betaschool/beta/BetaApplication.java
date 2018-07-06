package com.betaschool.beta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BetaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetaApplication.class, args);
	}
}
