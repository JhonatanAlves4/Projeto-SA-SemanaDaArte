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
//"https://sa-arte.vercel.app"
public class VisitanteController {
	
    @Autowired
    VisitanteServiceImpl visitanteService;

    /*@RequestMapping(value= "api/", method=RequestMethod.OPTIONS)
    public void corsHeaders(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "http://localhost:3000");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
        response.addHeader("Access-Control-Max-Age", "3600");
    }*/
    
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
