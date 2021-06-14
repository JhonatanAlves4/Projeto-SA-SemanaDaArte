package com.semanaArte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semanaArte.model.ArteUrbana;
import com.semanaArte.repository.ArteUrbanaRepository;

@RestController
@RequestMapping("/arte-urbana")
@CrossOrigin(origins = "http://192.168.15.8:3000")
public class ArteUrbanaController {
	
	@Autowired
	private ArteUrbanaRepository arteUrbanaRepository;
	
	@GetMapping(value = "/", produces = "application/json")
	public List<ArteUrbana> ListarTodos() {
		return arteUrbanaRepository.findAll();
	}

}
	