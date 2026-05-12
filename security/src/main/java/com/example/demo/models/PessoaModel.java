package com.example.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    /* @OneToMany
       private List<JobModel> trabalho = new ArrayList<>();
    */

    @OneToMany
    private List<JobModel> jobModelList;

}
