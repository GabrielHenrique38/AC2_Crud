package com.example.ac1pt2.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ac1pt2.dtos.DTO_categoria;
import com.example.ac1pt2.dtos.DadosCategoriaDTO;
import com.example.ac1pt2.models.Categoria;
@Service
public interface CategoriaService {


// Metodos pedidos AC2


    Categoria salvar(CategoriaDTO CategoriaDTO);
    CategoriaDTO obterCategoriaPorId(Long id);
    void remover(Long id);
    void editar(Long id, CategoriaDTO CategoriaDto);
    List<CategoriaDTO> obterTodos();
   
} 