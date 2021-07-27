package br.com.exercicios.objeto;

import java.util.ArrayList;

public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

}
