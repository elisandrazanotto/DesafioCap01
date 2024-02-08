package com.devsuperior.desafiocapitulo01.dto;

import com.devsuperior.desafiocapitulo01.entities.Client;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O campo 'name' precisa ter de 3 a 80 caracteres.")
    @NotBlank(message = "O campo 'name' não pode ser vazio.")
    private String name;
    @NotBlank(message = "O campo 'cpf' não pode ser vazio.")
    private String cpf;
    @Positive(message = "O campo 'income' deve ser positivo.")
    @NotNull(message = "O campo 'income' não pode ser vazio.")
    private Double income;
    @PastOrPresent(message = "O campo 'birthDate' não pode ser data futura.")
    @NotNull(message = "O campo 'birthDate' não pode ser vazio.")
    private LocalDate birthDate;
    @Positive(message = "O campo 'children' deve ser positivo.")
    @NotNull(message = "O campo 'children' não pode ser vazio.")
    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.cpf = client.getCpf();
        this.income = client.getIncome();
        this.birthDate = client.getBirthDate();
        this.children = client.getChildren();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
