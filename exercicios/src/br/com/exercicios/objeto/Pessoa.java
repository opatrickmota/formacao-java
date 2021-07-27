package br.com.exercicios.objeto;

import java.math.BigDecimal;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private BigDecimal altura;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, BigDecimal altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    public Pessoa(String nome, String dataNascimento, BigDecimal altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
