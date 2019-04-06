package com.joaoduraes.stream.drinking.source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StreamDrinkingSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamDrinkingSourceApplication.class, args);
	}

}
