package com.senai.apiusuarios.controller;

import com.senai.apiusuarios.model.Usuario;
import com.senai.apiusuarios.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> listar(){
        return repository.findAll();
    }

    @PostMapping
    public Usuario criar(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }

}
