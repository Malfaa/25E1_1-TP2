package org.example.Parte3;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) { //TESTAR
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha");
        String senha = scanner.nextLine();

        String novaSenha = "";

        while (!senha.equals(novaSenha)){
            System.out.println("Digite a senha novamente:");
            novaSenha = scanner.nextLine();
        }

        System.out.println("Senha confirmada com sucesso!");
    }
}
