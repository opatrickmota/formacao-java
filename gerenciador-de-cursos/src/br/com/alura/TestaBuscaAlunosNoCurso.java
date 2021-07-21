package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com matricula 6541?");
        Aluno aluno = javaColecoes.buscaMatriculado(6541);
        System.out.println("aluno: " + aluno);
    }
}
