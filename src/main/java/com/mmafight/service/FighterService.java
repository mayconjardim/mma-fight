package com.mmafight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmafight.entities.Fighter;
import com.mmafight.repositories.FighterRepository;


@RestController
@RequestMapping(value = "/fighters")
public class FighterService {

	@Autowired
	private FighterRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Fighter>> findAll() {
		List<Fighter> list = repository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Fighter>> findById(@PathVariable Long id) {
		Optional<Fighter> fighter = repository.findById(id);
		return ResponseEntity.ok().body(fighter);
	}
	
}
