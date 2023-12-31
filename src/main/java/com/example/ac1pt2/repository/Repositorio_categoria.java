package com.example.ac1pt2.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ac1pt2.models.Categoria;

public interface Repositorio_categoria extends JpaRepository<Categoria, Long>{


    @Query("SELECT c FROM Categoria c LEFT JOIN FETCH c.produtos p WHERE c.id = :id")
    Categoria findByIdWithProdutos(@Param("id") Long id);
    
}
