package org.example.Parte1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento: (dia/mês/ano)");
        String input = scanner.nextLine();

        LocalDate atual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long idadeEmDias = ChronoUnit.DAYS.between(dataNascimento, atual);

        System.out.println("Usuário possuí a idade em dias: " + idadeEmDias + " dias");

        /*
        Após uma pesquisa, o cálculo de dias está considerando os anos bissextos, a classe LocalDate e o método
        ChronoUnit.DAYS.between() são projetados para lidar automaticamente com os anos bissextos.
         */

        scanner.close();
    }
}
