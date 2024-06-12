package com.gg.projectapimed.controller;


import com.gg.projectapimed.medico.DadosCadastroMedico;
import com.gg.projectapimed.medico.Medico;
import com.gg.projectapimed.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;


    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save( new Medico(dados) );
    }


}
