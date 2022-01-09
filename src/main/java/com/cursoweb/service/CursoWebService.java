package com.cursoweb.service;

import com.cursoweb.domain.CursoWeb;
import com.cursoweb.repository.CursoWebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoWebService {

    @Autowired
    CursoWebRepository cursoWebRepository;

    public void criarLead(CursoWeb cursoWeb){
        cursoWebRepository.save(cursoWeb);
    }

    public Iterable<CursoWeb> exibirPageCurso(){
        return cursoWebRepository.findAll();
    }

}
