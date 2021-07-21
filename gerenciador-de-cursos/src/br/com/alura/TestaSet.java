package br.com.alura;

import java.util.*;

public class TestaSet {
    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Joao Souza");
        alunos.add("Pedro Henrique");
        alunos.add("Sergio Lopes");
        alunos.add("Rena Matheus");
        alunos.add("Aline Tinasd");
        alunos.add("Mauricio JKsd");
        alunos.add("Mauricio JKsd");

        alunos.forEach(aluno -> System.out.println(aluno));

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos); // agora eu posso usar o .get(index)
    }
}
