package com.mycompany.ex1.km;

import java.util.Scanner;

public class Ex1KM {

    public static void main(String[] args) {
        double kmInicial, kmFinal, litroGasto, precoLitro;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite quilometragem inicial: ");
        kmInicial = sc.nextDouble();

        System.out.print("Digite a quilometragem final: ");
        kmFinal = sc.nextDouble();

        System.out.print("Digite a a quantidade de litros gastos: ");
        litroGasto = sc.nextDouble();

        System.out.print("Digite o preço do litro: ");
        precoLitro = sc.nextDouble();

//        Chamando o método dentro da main
        calcularKm(kmInicial, kmFinal, litroGasto, precoLitro);
    }

    public static void calcularKm(double kmInicial, double kmFinal, double litroGasto, double precoLitro) {
        double distanciaPercorrida = kmFinal - kmInicial;
        double consumoMedio = distanciaPercorrida / litroGasto;
        double valorGasto = litroGasto * precoLitro;

        System.out.println("Distância percorrida: " + distanciaPercorrida + " Km");
        System.out.println("Consumo médio: " + consumoMedio + " Km/L");
        System.out.println("Valor gasto: R$ " + valorGasto);
    }

}
