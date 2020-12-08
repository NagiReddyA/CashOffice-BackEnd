package com.sais.cashoffice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfiguration {
	
	private String url;
	private String username;
	private String password;
	private String driverClassName;
	
	@Profile("dev")
	@Bean
	public void devDatabaseConnection() {
		System.out.println(url);
		System.out.println("system running dev profile properties");
	}

}
