package br.com.exercicios.exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(getDataNascimento());
            Date hoje = new Date();

            Calendar calendar = new GregorianCalendar();
            calendar.setTime(data);
            int anoNascimento = calendar.get(Calendar.YEAR);
            calendar.setTime(hoje);
            int anoAtual = calendar.get(Calendar.YEAR);

            System.out.println("Idade: " + (anoAtual-anoNascimento)+" anos");

        }catch (ParseException ex) {
            ex.printStackTrace();
        }


    }
}
