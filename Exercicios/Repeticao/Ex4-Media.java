package com.mycompany.media;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        int quantidadeValores;
        double soma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores: ");
        quantidadeValores = sc.nextInt();
        if(quantidadeValores <= 0){
            System.out.println("Digite um valor maior que zero!");
            return;
        }
        System.out.println("Digite os " + quantidadeValores + " valores: ");

        for (int i = 0; i < quantidadeValores; i++) {
            soma += sc.nextDouble();
        }
        System.out.println("A média dos valores é: " + calcularMedia(quantidadeValores, soma));
    }

    public static double calcularMedia(int quantidadeValores, double soma) {
        double resultadoMedia = soma / quantidadeValores;
        return resultadoMedia;
    }

}
