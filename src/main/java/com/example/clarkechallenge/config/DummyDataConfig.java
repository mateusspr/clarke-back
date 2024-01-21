package com.example.clarkechallenge.config;

import com.example.clarkechallenge.models.Fornecedor;
import com.example.clarkechallenge.repositories.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DummyDataConfig {

    @Bean
    CommandLineRunner initData(FornecedorRepository fornecedorRepository) {
        return args -> {
            Fornecedor fornecedor1 = new Fornecedor();
            fornecedor1.setNome("Fornecedor A");
            fornecedor1.setLogo("logoA.png");
            fornecedor1.setEstadoOrigem("Estado A");
            fornecedor1.setCustoPorKwh(0.20);
            fornecedor1.setLimiteMinimoKwh(25000);
            fornecedor1.setNumeroTotalClientes(1000);
            fornecedor1.setAvaliacaoMediaClientes(4.5);

            Fornecedor fornecedor2 = new Fornecedor();
            fornecedor2.setNome("Fornecedor B");
            fornecedor2.setLogo("logoB.png");
            fornecedor2.setEstadoOrigem("Estado B");
            fornecedor2.setCustoPorKwh(0.18);
            fornecedor2.setLimiteMinimoKwh(30000);
            fornecedor2.setNumeroTotalClientes(800);
            fornecedor2.setAvaliacaoMediaClientes(4.1);

            Fornecedor fornecedor3 = new Fornecedor();
            fornecedor3.setNome("Fornecedor C");
            fornecedor3.setLogo("logoC.png");
            fornecedor3.setEstadoOrigem("Estado C");
            fornecedor3.setCustoPorKwh(0.25);
            fornecedor3.setLimiteMinimoKwh(30500);
            fornecedor3.setNumeroTotalClientes(900);
            fornecedor3.setAvaliacaoMediaClientes(5.0);

            Fornecedor fornecedor4 = new Fornecedor();
            fornecedor4.setNome("Fornecedor D");
            fornecedor4.setLogo("logoD.png");
            fornecedor4.setEstadoOrigem("Estado D");
            fornecedor4.setCustoPorKwh(0.15);
            fornecedor4.setLimiteMinimoKwh(70080);
            fornecedor4.setNumeroTotalClientes(500);
            fornecedor4.setAvaliacaoMediaClientes(4.6);

            Fornecedor fornecedor5 = new Fornecedor();
            fornecedor5.setNome("Fornecedor E");
            fornecedor5.setLogo("logoE.png");
            fornecedor5.setEstadoOrigem("Estado E");
            fornecedor5.setCustoPorKwh(1.25);
            fornecedor5.setLimiteMinimoKwh(80000);
            fornecedor5.setNumeroTotalClientes(60);
            fornecedor5.setAvaliacaoMediaClientes(4.3);

            fornecedorRepository.saveAll(Arrays.asList(fornecedor1, fornecedor2, fornecedor3, fornecedor4, fornecedor5));
        };
    }
}
