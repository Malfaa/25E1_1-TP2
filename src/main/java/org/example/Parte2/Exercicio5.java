package org.example.Parte2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        double valorComDesconto = 0;
        int desconto = 0;
        boolean isDesconto = false;

        if(valor > 1000){
            desconto = 10;
            isDesconto = true;
            valorComDesconto = valor - (valor * 0.1);

        }else if(valor >= 500){
            desconto = 5;
            isDesconto = true;
            valorComDesconto = valor - (valor * 0.05);
        }

        String resultado = isDesconto ? ("O valor de R$"+ valor +" com desconto de "+ desconto + "%% ficou por: R$"+ valorComDesconto + "\n") :
        ("O valor informado NÃO teve desconto, ficou por R$"+ valor+ "\n");

        System.out.printf(resultado);
    }
}
