package com.example.LavenderInventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
// for configuration 
@SpringBootApplication
public class LavenderInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LavenderInventoryApplication.class, args);
	}

}
