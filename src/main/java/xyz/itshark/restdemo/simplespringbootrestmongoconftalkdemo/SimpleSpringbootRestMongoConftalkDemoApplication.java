package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.service.Service;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.service.ServiceImpl;

@SpringBootApplication
public class SimpleSpringbootRestMongoConftalkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootRestMongoConftalkDemoApplication.class, args);
	}
	
	@Bean
	public Service serviceBean() {
		return new ServiceImpl();
	}
}
