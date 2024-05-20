package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Aluno extends PessoaFisica {

    @NotBlank(message = "O código de matrícula é obrigatório")
    private String codMatricula;

    @NotBlank(message = "O curso é obrigatório")
    private String curso;

    @NotBlank(message = "O semestre/ano é obrigatório")
    private String semestreAno;

    @NotBlank(message = "O período é obrigatório")
    private String periodo;

    @NotBlank(message = "A situação é obrigatória")
    private String situacao;
}