package org.example.Parte2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano qualquer: ");
        int ano = scanner.nextInt();

        boolean isBissexto = false;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    isBissexto = true;
                }
            } else {
                isBissexto = true;
            }
        }

        if (isBissexto){
            System.out.printf("O ano de %d é bissexto!", ano);
        }else{
            System.out.printf("O ano de %d não é bissexto!", ano);
        }

    }

    boolean verificarBissexto(){
        return false;
    }
}