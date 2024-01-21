package com.example.clarkechallenge.controller;

import com.example.clarkechallenge.models.Fornecedor;
import com.example.clarkechallenge.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @GetMapping("/melhor")
    public ResponseEntity<Fornecedor> obterMelhorFornecedorPorConsumo(@RequestParam int consumo) {

        Optional<Fornecedor> melhorFornecedor = fornecedorService.encontrarMelhorFornecedorPorConsumo(consumo);


        return melhorFornecedor.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
