package br.com.exercicios.exercicio2;

public class Agenda extends Pessoa {
    private Pessoa[] pessoas = new Pessoa[10];
    private int posicaoLivre = 0;

    public void armazenaPessoas(String nome, int idade, float altura){
        pessoas[posicaoLivre] = new Pessoa();
        pessoas[posicaoLivre].setAltura(altura);
        pessoas[posicaoLivre].setIdade(idade);
        pessoas[posicaoLivre].setNome(nome);
        posicaoLivre++;
    }

    public void removePessoa(String nome){
        int indice = buscaPessoa(nome);
        for (int i = 0; i < posicaoLivre ; i++){
            if(i >= indice){
                if(pessoas[i+1] == null){
                    pessoas[i] = null;
                    posicaoLivre -= 1;
                }else{
                    pessoas[i] = pessoas[i+1];
                }
            }
        }
    }

    public int buscaPessoa(String nome){
        int i;
        for(i=0;i<posicaoLivre;i++){
            if(pessoas[i].getNome() == nome){
                break;
            }
        }
        return i;
    }

    public void imprimeAgenda(){
        for (int i=0;i<posicaoLivre;i++){
            System.out.println(pessoas[i].getNome());
            System.out.println(pessoas[i].getIdade());
            System.out.println(pessoas[i].getAltura());
        }
    }

    public void imprimePessoa(int index){
        if(pessoas[index] == null){
            System.out.println("Não existe ninguem nessa posição");
            return;
        }
        System.out.println(pessoas[index].getNome());
        System.out.println(pessoas[index].getAltura());
        System.out.println(pessoas[index].getIdade());
    }

}
