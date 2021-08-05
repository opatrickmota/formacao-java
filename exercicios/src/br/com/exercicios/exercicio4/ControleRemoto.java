package br.com.exercicios.exercicio4;

import br.com.exercicios.objeto.Televisao;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(){
        televisao = new Televisao();
    }

    public void aumentaVolume(){
        if(televisao.getVolume() == 100){
            System.out.println("A televisão já está no volume máximo!");
            return;
        }
        televisao.setVolume(televisao.getVolume()+1);
    }

    public void diminuiVolume(){
        if(televisao.getVolume() == 0){
            System.out.println("A televisão já está no volume mínimo!");
            return;
        }
        televisao.setVolume(televisao.getVolume()-1);
    }

    public void trocaCanal(int numero){
        if(televisao.getCanal() < 1){
            System.out.println("Canal inválido");
            return;
        }
        televisao.setCanal(numero);
    }

    public void aumentaCanal(){
        televisao.setCanal(televisao.getCanal()+1);
    }

    public void diminuiCanal(){
        if(televisao.getCanal()==1){
            System.out.println("Você já está no primeiro canal!");
            return;
        }
        televisao.setCanal(televisao.getCanal()-1);
    }

    public void consultaVolume(){
        System.out.println("Volume: " + televisao.getVolume());
    }

    public void consultaCanal(){
        System.out.println("Canal: " + televisao.getCanal());
    }
}
