package org.example.Parte2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário bruto anual: ");
        double salarioBruto = scanner.nextDouble();

//        System.out.println("Digite o valor total das deduções: ");
//        double deducoes = scanner.nextDouble();
        double imposto = 0;
//        double valor = salarioBruto ;

        if(salarioBruto <= 30000){
            imposto = 0;
        } else if (salarioBruto <= 60000) {
            imposto = (salarioBruto * 0.1) - 3000;
        }else if (salarioBruto <= 120000) {
            imposto = (salarioBruto * 0.2) - 9000;
        }else {
            imposto = (salarioBruto * 0.3) - 21000;
        }

        if (imposto == 0) {
            System.out.println("Isento de imposto de renda.");
        } else {
            System.out.printf("Imposto de renda a pagar: R$ %.2f%n", imposto);
        }
        System.out.println(salarioBruto - imposto);
    }
}
