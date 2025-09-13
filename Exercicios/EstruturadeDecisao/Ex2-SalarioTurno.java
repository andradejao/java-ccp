package com.mycompany.exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int horas;
        double salario;
        String turno;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas = sc.nextInt();

        System.out.print("Digite o seu turno (D - Diurno/N - Noturno): ");
        turno = sc.next();

        if (!turno.equalsIgnoreCase("d") && !turno.equalsIgnoreCase("n")) {
            System.out.print("O turno " + turno + " nao e valido. Digite D ou N.");
            return;
        }

        if (turno.equals("n")) {
            salario = horas * 45.00;
            System.out.print("O seu salario no turno noturno e: R$" + salario);
        } else {
            salario = horas * 37.50;
            System.out.print("O seu salario no turno diurno e: R$" + salario);
        }

    }
}
