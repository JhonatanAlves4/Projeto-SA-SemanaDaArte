package com.semanaArte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semanaArte.model.Visitante;
import com.semanaArte.service.VisitanteServiceImpl;

@RestController
@RequestMapping("/visitante")
public class VisitanteController {
	
    @Autowired
    VisitanteServiceImpl visitanteService;
    
	@GetMapping(value = "/", produces = "application/json")
	public List<Visitante> findAll() {
		return visitanteService.findAll();
	}
	
    @PostMapping(value = "/", produces = "application/json")
    public Visitante newVisitante(@RequestBody Visitante visitante){
        return visitanteService.save(visitante);
    }
}
