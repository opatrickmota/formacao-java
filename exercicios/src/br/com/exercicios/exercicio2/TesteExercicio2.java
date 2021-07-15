package br.com.exercicios.exercicio2;

public class TesteExercicio2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenaPessoas("Patrick", 21, 1.77f);
        agenda.imprimeAgenda();

        System.out.println("---------REMOVENDO---------");

        agenda.removePessoa("Patrick");
        agenda.imprimeAgenda();

        agenda.armazenaPessoas("Aline", 19, 1.65f);
        agenda.imprimePessoa(0);
    }
}
