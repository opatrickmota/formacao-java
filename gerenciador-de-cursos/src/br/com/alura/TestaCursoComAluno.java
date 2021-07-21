package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando colecoes", 22));

        Aluno a1 = new Aluno("Rodrigo Rurine", 13246);
        Aluno a2 = new Aluno("Perdro Henrique", 6541);
        Aluno a3 = new Aluno("Aline Souza", 6541);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        javaColecoes.getAlunos().forEach(a -> System.out.println(a));

        System.out.print("O aluno "+a1+" esta matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno aline = new Aluno("Aline Souza", 6541);
        System.out.print("E a aline, esta matriculada? ");
        System.out.println(javaColecoes.estaMatriculado(aline));

        System.out.println("a3 equals aline?");
        System.out.println(a3.equals(aline));

        System.out.println(a3.hashCode() == aline.hashCode());

    }
}
