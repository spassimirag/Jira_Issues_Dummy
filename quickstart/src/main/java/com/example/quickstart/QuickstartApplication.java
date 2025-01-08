package com.example.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.ArrayList;

@SpringBootApplication
@EnableScheduling
public class QuickstartApplication {

	public static void main(String[] args) {


		SpringApplication.run(QuickstartApplication.class, args);
	}

}
