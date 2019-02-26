package com.avaya.ava;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
//@PropertySource({"classpath:application.properties"})
public class Application extends SpringBootServletInitializer{


	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}
