package com.cursoweb.controller;

import com.cursoweb.domain.CursoWeb;
import com.cursoweb.service.CursoWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursoWebController  {

    @Autowired
    CursoWebService cursoWebService;

    @GetMapping("/mT3ch-curso-web")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-curso-web")
    public String cadastrarCurso(CursoWeb cursoWeb) {
        cursoWebService.criarLead(cursoWeb);
        return "pages/cursoWeb";
    }


    @GetMapping("/mT3ch-receber-curso-web")
    public ModelAndView receberCurso() {
        ModelAndView model = new ModelAndView("pages/cursoWeb");
        Iterable<CursoWeb> cursoWeb = cursoWebService.exibirPageCurso();
        model.addObject("cursoWeb", cursoWeb);
        return model;
    }

}
