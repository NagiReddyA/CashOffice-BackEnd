package com.sais.cashoffice.CashOfficeTest;

import java.security.Principal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.sais.cashoffice", exclude = SecurityAutoConfiguration.class)
public class CashOfficeTestApplication {

	private static final Logger LOGGER = LogManager.getLogger(CashOfficeTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CashOfficeTestApplication.class, args);		
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}

//exclude attribute disables the spring automatic security setup
