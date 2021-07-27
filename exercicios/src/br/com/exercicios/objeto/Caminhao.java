package br.com.exercicios.objeto;

import java.util.ArrayList;

public class Caminhao {

    private String tipo;
    private int numeroPluviometros;
    private ArrayList<String> listaPluviometro = new ArrayList<String>();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPluviometros() {
        return numeroPluviometros;
    }

    public void setNumeroPluviometros(int numeroPluviometros) {
        this.numeroPluviometros = numeroPluviometros;
    }

    public ArrayList<String> getListaPluviometro() {
        return listaPluviometro;
    }

    public void setLista(ArrayList<String> lista) {
        this.listaPluviometro = lista;
    }
}
