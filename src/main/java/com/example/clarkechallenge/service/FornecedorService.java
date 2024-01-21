package com.example.clarkechallenge.service;

import com.example.clarkechallenge.models.Fornecedor;
import com.example.clarkechallenge.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Optional<Fornecedor> encontrarMelhorFornecedorPorConsumo(int consumo){

        int consumoArredondado = arredondarConsumo(consumo);

        List<Fornecedor> fornecedor = fornecedorRepository.findByLimiteMinimoKwhLessThanEqual(consumoArredondado);

        return fornecedor.stream()
                .min(Comparator.comparingDouble(Fornecedor::getCustoPorKwh));
    }

    private int arredondarConsumo(int consumo){
        return Math.round((float) consumo / 50) * 50;
    }
}
