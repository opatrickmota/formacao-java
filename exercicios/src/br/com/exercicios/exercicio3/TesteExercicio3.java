package br.com.exercicios.exercicio3;

public class TesteExercicio3 {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializa(3, 5);

        elevador.desce();

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

    }
}
