package com.arror.ArrorDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.arror.ArrorDoc.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ArrorDocBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrorDocBackendApplication.class, args);
	}

}
