package com.example.ac1pt2.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DTO_produto {
    private Long id;
    private String nome;
    private Double preco;

}
