package com.example.ejercicio2psp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio2psp.model.Cliente;
import com.example.ejercicio2psp.repository.ClienteRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public List<Cliente> obtenerClientes(){
        return clienteRepository.findAll();
    }
}
