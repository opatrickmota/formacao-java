package br.com.exercicios.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleHerdeira extends Controle{

    private static ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();

    public static void selecionaCaminhao(){
        Caminhao caminhao = new Caminhao();

        String tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'.");
        while (tipo.compareTo("Alfa") != 0  && tipo.compareTo("Beta") != 0){
            tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'.");
        }
        caminhao.setTipo(tipo);

        int numeroPluviometros = leInteiro("Informe o número de pluviômetros");
        while(numeroPluviometros < 0){
            numeroPluviometros = leInteiro("Informe o número de pluviômetros");
        }
        caminhao.setNumeroPluviometros(numeroPluviometros);

        caminhoes.add(caminhao);


        System.out.println("======= Imprimindo Dados =======");
        for (int i=0;i<caminhoes.size();i++){
            System.out.println(caminhoes.get(i).getTipo());
            System.out.println(caminhoes.get(i).getNumeroPluviometros());
        }
    }

}
