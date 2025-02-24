package org.example.Parte1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine();

        System.out.println("Digite nome da Mãe completo: ");
        String nomeMae = scanner.nextLine();

        System.out.println("Digite nome do Pai completo: ");
        String nomePai = scanner.nextLine();

        if(nome.length() > nomeMae.length() && nome.length() > nomePai.length()) {
            System.out.printf("\nSeu nome %s possuí %d dígitos, é maior que de seus pais!\n", nome, nome.length());

        } else if (nome.length() > nomeMae.length() ) {
            System.out.printf("\nSeu nome %s possuí %d dígitos, é maior que %s que possuí %d dígitos.\n", nome, nome.length(), nomeMae, nomeMae.length());

        }else if (nome.length() > nomePai.length()) {
            System.out.printf("\nSeu nome %s possuí %d dígitos, é maior que %s que possuí %d dígitos.\n", nome, nome.length(), nomePai, nomePai.length());
        }else{
            System.out.println("\nSeu nome não é maior que o de seus pais!");
        }
        System.out.println("\nNome: " + nome + "\nIdade: " + Integer.parseInt(idade) + " anos\nNome da Mãe: "+ nomeMae + "\nNome do Pai: " + nomePai);
    }
}