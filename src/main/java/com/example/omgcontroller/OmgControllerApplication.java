package com.example.omgcontroller;

import com.example.omgcontroller.repository.EventRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OmgControllerApplication {
	public static void main(String[] args) {
		SpringApplication.run(OmgControllerApplication.class, args);
	}
}
