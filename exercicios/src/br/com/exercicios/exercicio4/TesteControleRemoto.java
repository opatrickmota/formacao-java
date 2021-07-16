package br.com.exercicios.exercicio4;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.consultarVolume();
        controleRemoto.consultarCanal();

        controleRemoto.diminuirCanal();
        controleRemoto.diminuirVolume();

        controleRemoto.consultarVolume();
        controleRemoto.consultarCanal();

        controleRemoto.aumentarCanal();
        controleRemoto.aumentarVolume();

        controleRemoto.consultarVolume();
        controleRemoto.consultarCanal();
    }
}
