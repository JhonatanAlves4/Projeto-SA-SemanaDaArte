package com.semanaArte.service;

import com.semanaArte.model.Imagem;

import java.util.List;

public interface ImagemService {
    public List<Imagem> findAll();
    public Imagem save(Imagem imagem);
    public void deleteById(Long id);
}
