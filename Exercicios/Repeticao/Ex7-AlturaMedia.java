package com.mycompany.alturamedia;

import java.util.Scanner;

public class AlturaMedia {

    public static void main(String[] args) {
        String sexo;
        double alturaMasculino = 0;
        double alturaFeminino = 0;
        int contadorMasculino = 0;
        int contadorFeminino = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite o sexo (M/F) ou digite SAIR: ");
            sexo = sc.next();
            if (!sexo.equalsIgnoreCase("SAIR")) {
                System.out.print("Digite a altura: ");
                if (sexo.equalsIgnoreCase("M")) {
                    contadorMasculino++;
                    alturaMasculino += sc.nextDouble();
                } else if (sexo.equalsIgnoreCase("F")) {
                    contadorFeminino++;
                    alturaFeminino += sc.nextDouble();
                } else {
                    System.out.print("Digite um sexo válido");
                    return;
                }
            }
        } while (!sexo.equalsIgnoreCase("SAIR"));

        double mediaMasculino = alturaMasculino / contadorMasculino;
        double mediaFeminino = alturaFeminino / contadorFeminino;
        System.out.println("A altura média dos homens é: " + mediaMasculino);
        System.out.println("A altura média das mulheres é: " + mediaFeminino);
    }
}
