package com.mycompany.somafracao;

import java.util.Scanner;

public class SomaFracao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inteiro e positivo: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("Digite um valor maior que zero");
            return;
        }
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }
        System.out.println("Resultado: " + soma);
    }
}
