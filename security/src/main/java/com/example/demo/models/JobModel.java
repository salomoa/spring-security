package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class JobModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;

    @ManyToOne
    private PessoaModel pessoaModel;

}
