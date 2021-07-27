package br.com.exercicios.exercicio1;

import br.com.exercicios.objeto.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Exercicio extends Pessoa{

    public Exercicio(String nome, String dataNascimento, BigDecimal altura) {
        super(nome, dataNascimento, altura);
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Altura: "+getAltura());
    }

    public void calcularIdade(){
        if(isValidData()){
            System.out.println("Informe a data de nascimento antes de tentar calcular a idade.");
            return;
        }

        try{
            LocalDate parseDate = formatterData();
            LocalDate today = LocalDate.now();

            Period diff = Period.between(parseDate, today);

            System.out.println("Idade: " + diff.getYears()+" anos");

        }catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private LocalDate formatterData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parseDate = LocalDate.parse(getDataNascimento(), formatter);
        return parseDate;
    }

    private boolean isValidData() {
        return getDataNascimento() == null;
    }
}
