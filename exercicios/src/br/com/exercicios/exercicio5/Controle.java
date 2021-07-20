package br.com.exercicios.exercicio5;

import java.util.Scanner;

public class Controle {

    public static String leString(String texto){
        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    public static int leInteiro(String texto){
        boolean isNotInt = true;
        int inteiro = -1;

        System.out.println(texto);
        Scanner scanner = new Scanner(System.in);

        String linha = scanner.nextLine();

        try{
            inteiro = Integer.parseInt(linha);
            isNotInt = false;
        }catch (Exception ex){
            System.out.println("Você não digitou um número inteiro positivo!");
        }

        return inteiro;
    }
}
