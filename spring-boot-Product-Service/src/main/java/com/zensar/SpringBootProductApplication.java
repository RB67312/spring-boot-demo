package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test", "com.zensar" })
public class SpringBootProductApplication {
	//public class SpringBootProductApplication extends SpringBootServletInitializer{

	public static void main(String... args) {
		System.out.println("Raghav");
		SpringApplication.run(SpringBootProductApplication.class, args);
		System.out.println("Battula");
	}
	
		@Bean
		public ModelMapper getmodelMapper() {
			return new ModelMapper();

		}

	}



