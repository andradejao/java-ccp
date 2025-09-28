package com.mycompany.tabuada;

public class Tabuada {

    public static void main(String[] args) {

        for (int tab = 0; tab <= 10; tab++) {
            System.out.println("Tabuada do: " + tab);
            for (int i = 0; i <= 10; i++) {
                int resultado = tab * i;
                System.out.println(tab + " x " + i + " = " + resultado);
            }
            System.out.println();
        }
    }
}
