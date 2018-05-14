package com.henry;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.henry.entity.PopData;
import com.henry.service.PopDataService;

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(PopDataService popDataService) {
		return args -> {
			// read json file and write to MySQL database
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<PopData>> typeReference = new TypeReference<List<PopData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<PopData> popData = mapper.readValue(inputStream, typeReference);
				popDataService.save(popData);
				System.out.println("Data saved successfully.");
			} catch (Exception e) {
				System.out.println("Unable to save data: " + e.getMessage());
			}
		};
	}
}