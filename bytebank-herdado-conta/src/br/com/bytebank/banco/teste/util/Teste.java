package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; // primitivo
        Integer idadeRef = Integer.valueOf(29); // autoboxing
        int valor = idadeRef.intValue(); // unboxing

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        String numeroString = "10";
        int numero = Integer.parseInt(numeroString);
        System.out.println(numero);


        List<Integer> numeros = new ArrayList<Integer>(); // so é lista de referencias e nao de primitivos
        numeros.add(29); // Autoboxing (transformacao do primitivo para objeto)
    }
}
