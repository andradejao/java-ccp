package geometria;

import java.util.Scanner;

public class Geometria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Circunferencia ---");
        System.out.println("Raio:");
        float raio = sc.nextFloat();
        System.out.println();
        System.out.println("--- Retangulo ---");
        System.out.println("Base: ");
        float base = sc.nextFloat();
        System.out.println("Altura: ");
        float altura = sc.nextFloat();

        Retangulo r1 = new Retangulo(base, altura);
        Circunferencia c1 = new Circunferencia(raio);
        
        c1.mostra();
        r1.mostra();
    }

}
