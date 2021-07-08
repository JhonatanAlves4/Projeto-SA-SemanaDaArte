package com.semanaArte.controller;

import com.semanaArte.model.Imagem;
import com.semanaArte.model.Visitante;
import com.semanaArte.service.ImagemService;
import com.semanaArte.service.ImagemServiceImpl;
import com.semanaArte.service.VisitanteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("imagem/")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge = 3600)

public class ImagemController {
    @Autowired
    ImagemServiceImpl imagemService;

    @GetMapping(value = "/", produces = "application/json")
    public List<Imagem> findAll() {
        return imagemService.findAll();
    }

    @PostMapping(value = "/", produces = "application/json")
    public Imagem newImagem(@RequestBody Imagem imagem){
        return imagemService.save(imagem);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public void delete(@PathVariable Long id){
        imagemService.deleteById(id);
    }
}
