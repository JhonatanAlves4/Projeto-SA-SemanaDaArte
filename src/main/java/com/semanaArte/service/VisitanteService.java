package com.semanaArte.service;

import java.util.List;
import com.semanaArte.model.Visitante;

public interface VisitanteService {
    public List<Visitante> findAll();
    public Visitante save(Visitante visitante);
    public void deleteById(Long id);
}

