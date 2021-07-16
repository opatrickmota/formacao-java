package br.com.exercicios.exercicio4;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(){
        televisao = new Televisao();
    }

    public void aumentarVolume(){
        if(televisao.getVolume() == 100){
            System.out.println("A televisão já está no volume máximo!");
            return;
        }
        televisao.setVolume(televisao.getVolume()+1);
    }

    public void diminuirVolume(){
        if(televisao.getVolume() == 0){
            System.out.println("A televisão já está no volume mínimo!");
            return;
        }
        televisao.setVolume(televisao.getVolume()-1);
    }

    public void trocarCanal(int numero){
        televisao.setCanal(numero);
    }

    public void aumentarCanal(){
        televisao.setCanal(televisao.getCanal()+1);
    }

    public void diminuirCanal(){
        if(televisao.getCanal()==1){
            System.out.println("Você já está no primeiro canal!");
        }
        televisao.setCanal(televisao.getCanal()-1);
    }

    public void consultarVolume(){
        System.out.println("Volume: " + televisao.getVolume());
    }

    public void consultarCanal(){
        System.out.println("Canal: " + televisao.getCanal());
    }
}
