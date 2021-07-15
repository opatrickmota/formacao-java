package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {
        //System.out.println("x");
        //System.out.println(3);
        //System.out.println(false);

        ContaPoupanca cp = new ContaPoupanca(22,33);
        ContaCorrente cc = new ContaCorrente(33,22);
        Object contaSuperGenericaPolimorfismo = new ContaCorrente(33,22);
        Cliente cliente = new Cliente();

        System.out.println(cc);
        System.out.println(cp);

        println();
        println(cc);
        println(cliente);
    }
    static void println(){ }
    static void println(int a){ }
    static void println(boolean valor){ }
    static void println(Object conta){ }
}
