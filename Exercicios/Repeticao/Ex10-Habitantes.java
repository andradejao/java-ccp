package com.mycompany.habitantes;

import java.util.Scanner;

public class Habitantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int somaIdade = 0;
        int totalPessoas = 0;
        double somaSalarioHomens = 0;
        int contadorHomens = 0;
        int mulheresSalarioAbaixo600 = 0;
        int idade;
        String sexo;
        double salario;

        do {
            System.out.print("Digite a idade (ou -1 para encerrar): ");
            idade = sc.nextInt();

            if (idade < 0) {
                break;
            }
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next();

            System.out.print("Digite o salário: ");
            salario = sc.nextDouble();

            somaIdade += idade;
            totalPessoas++;

            if (sexo.equalsIgnoreCase("M")) {
                somaSalarioHomens += salario;
                contadorHomens++;
            } else if (sexo.equalsIgnoreCase("F")) {
                if (salario < 600) {
                    mulheresSalarioAbaixo600++;
                }
            } else {
                System.out.println("Sexo inválido. Use M ou F.");
            }

        } while (true);

        double mediaIdade;
        if (totalPessoas > 0) {
            mediaIdade = (double) somaIdade / totalPessoas;
        } else {
            mediaIdade = 0;
        }

        double mediaSalarioHomens;
        if (contadorHomens > 0) {
            mediaSalarioHomens = somaSalarioHomens / contadorHomens;
        } else {
            mediaSalarioHomens = 0;
        }

        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Média de salários dos homens: R$" + mediaSalarioHomens);
        System.out.println("Quantidade de mulheres com salário abaixo de R$600,00: " + mulheresSalarioAbaixo600);
    }
}
