package com.example.clarkechallenge.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "fornecedores")
@Table(name = "fornecedores")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String logo;
    private String estadoOrigem;
    private double custoPorKwh;
    private int limiteMinimoKwh;
    private int numeroTotalClientes;
    private double avaliacaoMediaClientes;


}
