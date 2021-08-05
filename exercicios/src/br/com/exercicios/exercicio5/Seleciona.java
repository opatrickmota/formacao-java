package br.com.exercicios.exercicio5;

import br.com.exercicios.objeto.Caminhao;

import java.util.ArrayList;

public class Seleciona extends Controle{

    private static ArrayList<Caminhao> caminhoes = new ArrayList<>();

    public static void armazenaCaminhao(){

        String tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'. Para sair escreva 'Fim'.");

        while (naoEhFim(tipo)){
            Caminhao caminhao = new Caminhao();
            ArrayList<String> tiposPluviometros = new ArrayList<>();

            tipo = lerTipoAteSerUmValido(tipo);

            if("Fim".compareTo(tipo) == 0){
                imprimir(caminhoes);
                return;
            }

            caminhao.setTipo(tipo);

            int numeroPluviometros = leInteiro("Informe o número de pluviômetros");

            numeroPluviometros = lerNumeroPluviometrosAteSerPositivoInteiro(numeroPluviometros);

            caminhao.setNumeroPluviometros(numeroPluviometros);

            for (int i = 0; i<numeroPluviometros; i++){
                tiposPluviometros.add(leString("Informe o " +(i+1)+ "° pluviometro:"));
            }
            caminhao.setLista(tiposPluviometros);

            caminhoes.add(caminhao);

            tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'. Para sair escreva 'Fim'.");
        }

        imprimir(caminhoes);

    }

    private static String lerTipoAteSerUmValido(String tipo) {
        while (isIncorrectInput(tipo)){
            tipo = leString("Escreva o tipo do caminhao, sendo possivel 'Alfa' ou 'Beta'. Para sair escreva 'Fim'.");
        }
        return tipo;
    }

    private static int lerNumeroPluviometrosAteSerPositivoInteiro(int numeroPluviometros) {
        while(numeroPluviometros < 0){
            numeroPluviometros = leInteiro("Informe o número de pluviômetros");
        }
        return numeroPluviometros;
    }

    private static boolean isIncorrectInput(String tipo) {
        return "Alfa".compareTo(tipo) != 0 && "Beta".compareTo(tipo) != 0 && "Fim".compareTo(tipo) != 0;
    }

    private static boolean naoEhFim(String tipo) {
        return "Fim".compareTo(tipo)!=0;
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
            caminhao.getListaPluviometro().forEach(System.out::println);
            System.out.println("--------");
        });
    }
}
