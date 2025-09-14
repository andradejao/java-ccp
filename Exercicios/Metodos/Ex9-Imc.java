package com.mycompany.ex9.imc;

import java.util.Locale;
import java.util.Scanner;

public class Ex9IMC {

    public static void main(String[] args) {
        double altura, peso;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Digite o seu peso: ");
        peso = sc.nextDouble();

        String imcFormatado = String.format(Locale.US, "%.2f", calcularImc(altura, peso));

        System.out.println("O seu IMC é: " + imcFormatado);
    }

    public static double calcularImc(double altura, double peso) {
        return peso / (altura * altura);
    }
}
