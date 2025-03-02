package org.example.Parte3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase!");
        String frase = scanner.nextLine();

        String[] palavras = frase.split(" ");

        int contagem = palavras.length;

        System.out.println("No total temos: " + contagem + " palavras.");
        scanner.close();
    }
}
