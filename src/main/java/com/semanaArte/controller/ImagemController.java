package com.semanaArte.controller;

import com.semanaArte.model.Imagem;
import com.semanaArte.model.Visitante;
import com.semanaArte.service.ImagemServiceImpl;
import com.semanaArte.service.VisitanteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
