package br.com.exercicios.exercicio1;

import java.math.BigDecimal;

public class TestaExe1 {
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio("Aline", "01/05/2005", new BigDecimal("1.65"));

        exercicio.imprimirDados();

        exercicio.calcularIdade();
    }
}
