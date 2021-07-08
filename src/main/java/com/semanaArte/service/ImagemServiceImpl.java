package com.semanaArte.service;

import com.semanaArte.model.Imagem;
import com.semanaArte.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagemServiceImpl implements ImagemService {
    @Autowired
    ImagemRepository imagemRepository;

    @Override
    public List<Imagem> findAll() {
        return imagemRepository.findAll();
    }

    @Override
    public  Imagem save(Imagem imagem) {return imagemRepository.save(imagem);}
}