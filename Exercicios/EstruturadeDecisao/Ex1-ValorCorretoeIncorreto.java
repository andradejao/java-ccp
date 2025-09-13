package com.mycompany.exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int valor;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        valor = sc.nextInt();

        if (valor >= 0 && valor <= 9) {
            System.out.print("Valor correto!");
        } else {
            System.out.print("Valor incorreto!");
        }
    }
}
