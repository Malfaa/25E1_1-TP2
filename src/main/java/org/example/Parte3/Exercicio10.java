package org.example.Parte3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe um número! \nDigite um valor entre 1 e 100: ");
        int numAleatorio = (int) (Math.floor(Math.random() * 100) + 1);
        int palpite;

        do{
            palpite = scanner.nextInt();

            System.out.println(palpite == numAleatorio ? "Você acertou o número!" :
                    palpite > numAleatorio ? "O número que você digitou é MAIOR que o número para ser adivinhado!" :
                            "O número que você digitou é MENOR que o número para ser adivinhado!");

        }
        while(numAleatorio != palpite);

        scanner.close();
    }
}