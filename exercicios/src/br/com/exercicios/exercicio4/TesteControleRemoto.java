package br.com.exercicios.exercicio4;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.consultaVolume();
        controleRemoto.consultaCanal();

        controleRemoto.diminuiCanal();
        controleRemoto.diminuiVolume();

        controleRemoto.consultaVolume();
        controleRemoto.consultaCanal();

        controleRemoto.aumentaCanal();
        controleRemoto.aumentaVolume();

        controleRemoto.consultaVolume();
        controleRemoto.consultaCanal();
    }
}
