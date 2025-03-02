package org.example.Parte1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double segundaNota = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double quartaNota = scanner.nextDouble();

        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 7){
            System.out.println("Usuário foi APROVADO! (Nota Final: " + media + ")");
        }else if(media >= 5){
            System.out.println("Usuário está de RECUPERAÇÃO! (Nota Final: " + media + ")");
        }else{
            System.out.println("Usuário foi REPROVADO! (Nota Final: " + media + ")");
        }

        scanner.close();
    }
}
