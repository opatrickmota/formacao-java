package br.com.exercicios.exercicio2;

import java.math.BigDecimal;

public class TesteExercicio2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenaPessoas("Patrick", 21, new BigDecimal("1.77"));
        agenda.imprimeAgenda();

        System.out.println("---------REMOVENDO---------");

        agenda.removePessoa("Patrick");
        agenda.imprimeAgenda();

        agenda.armazenaPessoas("Aline", 19, new BigDecimal("1.65"));

        System.out.println("---------IMPRIMINDO AGENDA---------");

        agenda.imprimeAgenda();
    }
}
