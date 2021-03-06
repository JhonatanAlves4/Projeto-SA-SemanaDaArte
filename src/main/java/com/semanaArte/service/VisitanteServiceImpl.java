package com.semanaArte.service;

import java.util.List;

import com.semanaArte.repository.VisitanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semanaArte.model.Visitante;

@Service
public class VisitanteServiceImpl implements VisitanteService {
	@Autowired
    VisitanteRepository visitanteRepository;
	 
	@Override
    public List<Visitante> findAll() {
        return visitanteRepository.findAll();
	}

    @Override
    public Visitante save(Visitante visitante) {
        return visitanteRepository.save(visitante);
    }

    @Override
    public void deleteById(Long id) {
        visitanteRepository.deleteById(id);
    }
}
