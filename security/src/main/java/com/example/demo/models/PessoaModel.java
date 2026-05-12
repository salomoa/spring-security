package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    

}
