package br.com.exercicios.exercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;

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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Altura: "+getAltura());
    }

    public void calcularIdade(){
        if(getDataNascimento() == null){
            System.out.println("Informe a data de nascimento antes de tentar calcular a idade.");
            return;
        }

        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate parseDate = LocalDate.parse(getDataNascimento(), formatter);
            LocalDate today = LocalDate.now();

            Period diff = Period.between(parseDate, today);

            System.out.println("Idade: " + diff.getYears()+" anos");

        }catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
