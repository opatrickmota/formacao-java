package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // primitivo
        Integer idadeRef = new Integer(29); // int por baixo dos panos
        List<Integer> numeros = new ArrayList<Integer>(); // so é lista de referencias e nao de primitivos
        numeros.add(29); // Autoboxing (transformacao do primitivo para objeto)
    }
}
