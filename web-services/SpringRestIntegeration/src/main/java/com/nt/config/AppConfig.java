package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="com.nt.*")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig");
	}
}
