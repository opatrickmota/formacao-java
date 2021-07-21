package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Classe para ver a diferenca entre a velocidade do HashSet para o ArrayList
 */

public class TestaPerformance {

    public static void main(String[] args) {

        //Collection<Integer> numeros = new ArrayList<>();
        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}