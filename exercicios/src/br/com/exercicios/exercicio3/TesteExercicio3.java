package br.com.exercicios.exercicio3;

import br.com.exercicios.objeto.Pessoa;

import java.math.BigDecimal;

public class TesteExercicio3 {
    public static void main(String[] args) {
        Exercicio exercicio = new Exercicio(3, 5);

        exercicio.sobe();
        exercicio.desce();

        exercicio.entra(new Pessoa("Patrick", 21, new BigDecimal("1.77")));
        exercicio.entra(new Pessoa("Aline", 19, new BigDecimal("1.65")));
        exercicio.entra(new Pessoa("José", 25, new BigDecimal("1.85")));

        exercicio.sai(new Pessoa("José", 25, new BigDecimal("1.85")));

        exercicio.imprimePessoasNoElevador();

    }
}
