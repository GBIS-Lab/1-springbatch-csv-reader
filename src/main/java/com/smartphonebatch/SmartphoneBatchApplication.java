package com.smartphonebatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;

import java.io.File;
import java.util.List;

@SpringBootApplication
public class SmartphoneBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartphoneBatchApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			// Lecture du fichier CSV
			File file = new File("src/main/resources/smartphones.csv");
			if (file.exists()) {
				System.out.println("Le fichier existe à l'emplacement : " + file.getAbsolutePath());
				List<String> lignes = java.nio.file.Files.readAllLines(file.toPath());
				lignes.forEach(System.out::println);  // Affichage de chaque ligne
			} else {
				System.out.println("Le fichier n'existe pas !");
			}
		};
	}
}