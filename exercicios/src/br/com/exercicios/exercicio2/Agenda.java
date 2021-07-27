package br.com.exercicios.exercicio2;

import br.com.exercicios.objeto.Pessoa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda extends Pessoa {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    private int posicaoLivre = 0;

    public void armazenaPessoas(String nome, int idade, BigDecimal altura){
        if (isMaximunSizeReached()){
            System.out.println("Tamanho máximo atingindo!");
            return;
        }
        pessoas.add(new Pessoa(nome, idade, altura));
    }

    private boolean isMaximunSizeReached() {
        return pessoas.size() == 10;
    }

    public void removePessoa(String nome){
        pessoas.remove(buscaPessoa(nome));
    }

    public int buscaPessoa(String nome){
        List<Pessoa> pessoaFiltrada = pessoas.stream().filter(pessoa -> pessoa.getNome() == nome).collect(Collectors.toList());

        return pessoas.indexOf(pessoaFiltrada.get(0));
    }

    public void imprimeAgenda(){
        pessoas.forEach(pessoa -> {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getAltura());
        });
    }

    public void imprimePessoa(int index){
        if(personNotExist(index)){
            System.out.println("Não existe ninguem nessa posição");
            return;
        }
        System.out.println(pessoas.get(index).getNome());
        System.out.println(pessoas.get(index).getAltura());
        System.out.println(pessoas.get(index).getIdade());
    }

    private boolean personNotExist(int index) {
        return pessoas.get(index) == null;
    }

}
