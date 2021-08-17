package com.subhu.movieBookingSystem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.subhu.movieBookingSystem.services.InitService;

@SpringBootApplication
public class MovieBookingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieBookingSystemApplication.class, args);

	}

//	@Bean
//	CommandLineRunner init(InitService initService) {
//		return args -> {
//			initService.init();
//		};
//	}

}
