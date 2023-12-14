package com.mariana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mariana.service.EmailService;
import com.mariana.service.MockEmailService;
@Configuration
@Profile("test")
public class TestConfig {
			
		@Bean
		public EmailService emailService() {
			return new MockEmailService();
		}

	}


