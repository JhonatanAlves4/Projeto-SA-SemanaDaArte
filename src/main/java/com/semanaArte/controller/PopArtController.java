package com.semanaArte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semanaArte.model.PopArt;
import com.semanaArte.repository.PopArtRepository;

@RestController
@RequestMapping("/pop-art")
@CrossOrigin(origins = "http://192.168.15.8:3000")
public class PopArtController {
	
	@Autowired
	private PopArtRepository popArtRepository;
	
	@GetMapping(value = "/", produces = "application/json")
	public List<PopArt> ListarTodos() {
		return popArtRepository.findAll();
	}

}
