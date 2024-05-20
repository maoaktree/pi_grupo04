package com.app.api.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Funcionario extends PessoaFisica {

    @NotBlank(message = "O grau de escolaridade é obrigatório")
    private String grauEscolaridade;

    @NotBlank(message = "O cargo é obrigatório")
    private String cargo;

    @NotBlank(message = "O departamento é obrigatório")
    private String departamento;

    @NotBlank(message = "O código da função é obrigatório")
    private String codigoFuncao;

    private double salario;
}