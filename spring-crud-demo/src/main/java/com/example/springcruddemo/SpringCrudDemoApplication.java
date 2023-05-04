package com.example.springcruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
@EnableConfigurationProperties
@EntityScan(basePackages = { "com.example.springcruddemo.entity" })
public class SpringCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudDemoApplication.class, args);
	}

}
