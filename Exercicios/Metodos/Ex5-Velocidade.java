package com.mycompany.ex5.velocidade;

import java.util.Scanner;

public class Ex5Velocidade {

    public static void main(String[] args) {
        double distancia, tempo, velocidade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em Km: ");
        distancia = sc.nextDouble();

        System.out.print("Digite o tempo gasto em horas: ");
        tempo = sc.nextDouble();

        // Chamando o método para calcular
        velocidade = calcularVelocidade(distancia, tempo);

        System.out.println("A velocidade do objeto é: " + velocidade + " Km/h");

    }

    // Método para calcular
    public static double calcularVelocidade(double distancia, double tempo) {
        return distancia / tempo;
    }
}
