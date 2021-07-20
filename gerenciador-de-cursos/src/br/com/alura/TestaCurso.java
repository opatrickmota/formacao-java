package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        // aulas é imutavel pois usa programacao defensiva
        //javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21)); // nao funciona mais pois agora e read-only
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando colecoes", 22));

        System.out.println(javaColecoes.getAulas());
    }
}
