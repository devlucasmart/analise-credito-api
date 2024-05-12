package com.devlucasmart.analisecreditoapi;

import com.devlucasmart.analisecreditoapi.service.AnaliseCreditoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@AllArgsConstructor
@SpringBootApplication
public class AnaliseCreditoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnaliseCreditoApiApplication.class, args);
	}
}
