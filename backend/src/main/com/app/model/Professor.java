package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Professor extends PessoaFisica {

    @NotBlank(message = "A formação acadêmica é obrigatória")
    private String formacaoAcademica;

    @NotBlank(message = "O cargo é obrigatório")
    private String cargo;

    @NotBlank(message = "O departamento é obrigatório")
    private String departamento;

    @NotBlank(message = "O código do curso é obrigatório")
    private String codigoCurso;

    private double salario;
}