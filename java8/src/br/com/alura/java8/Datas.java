package br.com.alura.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2021, Month.JULY, 27);

        Period period = Period.between(hoje, olimpiadasRio);
        System.out.println(period.getYears());

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasOlimpiadas.format(formatter);
        System.out.println(valorFormatado);

        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterTime));

        LocalTime intervalo = LocalTime.of(15,30);
        System.out.println(intervalo);

    }
}
