package br.com.bytebank.banco.teste;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura";
        // String outro = new String("Alura");

        char c = 'A';

        nome = nome.replace("A", "a");

        System.out.println(nome);
        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos 2");
        texto = builder.toString();
        System.out.println(texto);
    }
}
