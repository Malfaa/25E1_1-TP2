package org.example.Parte3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.println("Agora, digite um valor de Incremento: ");
        int incremento = scanner.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        while (valorInicial <= 100) {
            lista.add(valorInicial);
            valorInicial += incremento;
        }

        System.out.println("Sequência gerada:");
        for (int numero : lista) {
            System.out.print(numero + ", ");
        }

        scanner.close();
    }
}