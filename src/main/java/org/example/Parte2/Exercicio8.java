package org.example.Parte2;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Em um triângulo, digite o comprimento do Primeiro lado: ");
        int a = scanner.nextInt();

        System.out.println("Digite o comprimento do Segundo lado: ");
        int b = scanner.nextInt();

        System.out.println("Digite o comprimento do Terceiro lado: ");
        int c = scanner.nextInt();

        System.out.println("O tipo do triângulo é: " + verificarTipoTriangulo(a, b, c));
    }

    static String verificarTipoTriangulo(int a, int b, int c){
        if((a == b && a == c)){
            return "Equilátero";
        }else if ((a==b) || (b==c) || a==c){
            return "Isósceles";
        }else {
            return "Escaleno";
        }
    }
}
