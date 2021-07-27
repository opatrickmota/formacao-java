package br.com.exercicios.objeto;

public class Televisao {
    private int volume;
    private int canal;

    public Televisao() {
        this.volume = 25;
        this.canal = 12;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}
