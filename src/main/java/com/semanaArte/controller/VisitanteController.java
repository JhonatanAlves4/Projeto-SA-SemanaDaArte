package com.semanaArte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.semanaArte.model.Visitante;
import com.semanaArte.service.VisitanteServiceImpl;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "https://sa-semana-da-arte-2021.vercel.app", allowedHeaders = "*", maxAge = 3600)

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

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id){
        visitanteService.deleteById(id);
    }
}
