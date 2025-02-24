package org.example.Parte1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em reais: ");
        double reais = scanner.nextDouble();

        System.out.println("Escolha uma moeda de destino digitando seu respectivo número: Dólar(1), Euro(2) ou Libra(3)");
        int moeda = scanner.nextInt();

        double valorConvertido = 0.0;
        String tipo = "";

        switch (moeda){
            case 1:
                valorConvertido = reais / 5.73;
                tipo = "$";
                break;
            case 2:
                valorConvertido = reais / 5.99;
                tipo = "€";
                break;
            case 3:
                valorConvertido = reais / 7.24;
                tipo = "£";
                break;
            default:
                System.out.println("Escolha indefinida.");
                break;
        }

        System.out.printf("O valor convertido é de: %s%.2f \n", tipo, valorConvertido);
    }
}
