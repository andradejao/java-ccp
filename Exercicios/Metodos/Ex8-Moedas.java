package com.mycompany.ex8.moedas;

import java.util.Locale;
import java.util.Scanner;

public class Ex8Moedas {

    public static void main(String[] args) {
        int vinteCinco, dez, cinco;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de moedas de 25 centavos: ");
        vinteCinco = sc.nextInt();

        System.out.print("Digite a quantidade de moedas de 10 centavos: ");
        dez = sc.nextInt();

        System.out.print("Digite a quantidade de moedas de 5 centavos: ");
        cinco = sc.nextInt();

        String valorFormatado = String.format(Locale.US, "%.2f", valorCofre(vinteCinco, dez, cinco));

        System.out.println("O cofre possui R$" + valorFormatado);
    }

    public static double valorCofre(int vinteCinco, int dez, int cinco) {
        double totalVinteCinco = vinteCinco * 0.25;
        double totalDez = dez * 0.10;
        double totalCinco = cinco * 0.05;
        return totalVinteCinco + totalDez + totalCinco;
    }
}
