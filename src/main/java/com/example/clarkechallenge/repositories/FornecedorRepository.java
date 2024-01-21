package com.example.clarkechallenge.repositories;

import com.example.clarkechallenge.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    List<Fornecedor> findByLimiteMinimoKwhLessThanEqual(int consumo);
}
