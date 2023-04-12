package br.com.provaonline.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.provaonline.enums.Dificuldade;
import br.com.provaonline.enums.Materia;
import br.com.provaonline.enums.Questoes;
import br.com.provaonline.model.Provas;
import br.com.provaonline.repositories.ProvasRepositorio;
import jakarta.validation.Valid;


@Controller
public class ControllerProva {    
    @Autowired
    private ProvasRepositorio provasRepositorio;


    @GetMapping("/provas")
    public ModelAndView index(){
        List<Provas> provas = this.provasRepositorio.findAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("provas/index");
        mv.addObject("provas", provas);
       return mv;
    }

 
    @GetMapping("/provas/novaProva")
    public ModelAndView novaProva(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("provas/novaProva");
        mv.addObject("disciplinas", Materia.values());
        mv.addObject("questoes", Questoes.values());
        mv.addObject("dificuldade", Dificuldade.values());
        return mv;
    }

    @PostMapping("/provas")
    public String create(@Valid Provas prova, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "redirect:/provas/novaProva";
        }else{
            Provas provas = prova.toProvas();
            this.provasRepositorio.save(provas);
            return "redirect:/provas";
        }
    }



}
