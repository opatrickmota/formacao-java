package br.com.bytebank.banco.teste.util;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.intValue());   // unboxing

        Double dRef = Double.valueOf(3.2);// autoboxing
        System.out.println(dRef.doubleValue());// unboxing

        Boolean bRef =Boolean.FALSE;// autoboxing
        System.out.println(bRef.booleanValue());// unboxing

        //Tipos de números tem como classe mae a Number
        Number refNumero = Double.valueOf(29.9);

        List<Number> lista = new ArrayList<Number>(); // guarda todos os tipos de numeros
        lista.add(10);
        lista.add(10.6f);
        lista.add(10.5);
    }

}
