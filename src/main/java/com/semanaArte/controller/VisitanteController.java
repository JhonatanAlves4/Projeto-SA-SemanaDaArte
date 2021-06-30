package com.semanaArte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.semanaArte.model.Visitante;
import com.semanaArte.service.VisitanteServiceImpl;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)
//"https://sa-arte.vercel.app"
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
