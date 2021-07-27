package br.com.exercicios.exercicio5;

import br.com.exercicios.objeto.Caminhao;

import java.util.ArrayList;

public class Seleciona extends Controle{

    private static ArrayList<Caminhao> caminhoes = new ArrayList<>();

    public static void armazenaCaminhao(){

        String tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'.");

        while (tipo.compareTo("Fim")!=0){
            Caminhao caminhao = new Caminhao();
            ArrayList<String> tiposPluviometros = new ArrayList<>();

            while (tipo.compareTo("Alfa") != 0  && tipo.compareTo("Beta") != 0 && tipo.compareTo("Fim")!=0){
                tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'.");
                if(tipo.compareTo("Fim") == 0){
                    imprimir(caminhoes);
                    return;
                }
            }
            caminhao.setTipo(tipo);

            int numeroPluviometros = leInteiro("Informe o número de pluviômetros");
            while(numeroPluviometros < 0){
                numeroPluviometros = leInteiro("Informe o número de pluviômetros");
            }
            caminhao.setNumeroPluviometros(numeroPluviometros);

            for (int i = 0; i<numeroPluviometros; i++){
                tiposPluviometros.add(leString("Informe o " +(i+1)+ "° pluviometro:"));
            }
            caminhao.setLista(tiposPluviometros);

            caminhoes.add(caminhao);

            tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'.");
        }

        imprimir(caminhoes);

    }
    public static void imprimir(ArrayList<Caminhao> caminhoes){
        System.out.println("======= Imprimindo Dados =======");
        if(caminhoes.isEmpty()){
            System.out.println("Não há dados para ser impresso!");
            return;
        }
        caminhoes.forEach(caminhao -> {
            System.out.println("Tipo do caminhão: "+caminhao.getTipo());
            System.out.println("Há "+caminhao.getNumeroPluviometros()+" pluviometro(s), sendo ele(s):");
            caminhao.getListaPluviometro().forEach(p -> System.out.println(p));
            System.out.println("--------");
        });
    }
}
