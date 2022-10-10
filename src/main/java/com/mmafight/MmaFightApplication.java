package com.mmafight;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mmafight.entities.Fighter;
import com.mmafight.repositories.FighterRepository;

@SpringBootApplication
public class MmaFightApplication implements CommandLineRunner {

	@Autowired
	private FighterRepository fighterRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MmaFightApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Fighter f1 = new Fighter(null, "Charles Oliviera", 13, 8, 18, 10, 7, 8, 8, 17, 15);
		
		Fighter f2 = new Fighter(null, "Islam Makhachev", 8, 2, 13, 15, 18, 15, 14, 10, 13);
		
		fighterRepository.saveAll(Arrays.asList(f1, f2));
		
	}

	
	
}
