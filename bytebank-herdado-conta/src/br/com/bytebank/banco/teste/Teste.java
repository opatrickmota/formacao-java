package br.com.bytebank.banco.teste;

public class Teste {
    public static void main(String[] args) {
        int[] idades = new int[5];// inicializa o array com 0 - valor padrao do int

        for(int i = 0; i < idades.length; i++){
            idades[i] = i * i ;
        }

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }

    }
}
