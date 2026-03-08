package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
//        Criando o scanner
        Scanner sc = new Scanner(System.in);

//  Criando os objetos          
        Produto p1 = new Produto();
        Produto p2 = new Produto("Nescau", "Nestle", "123456789", 15);

//    Preenchendo com os dados coletados
        System.out.println("Digite a marca: ");
        p1.marca = sc.nextLine();
        System.out.println("Digite o fabricante: ");
        p1.fabricante = sc.nextLine();
        System.out.println("Digite o código de barras: ");
        p1.codBarras = sc.nextLine();
        System.out.println("Digite o preço: ");
        p1.preco = sc.nextFloat();

//        Chamando a função para mostrar os dados
        p1.exibirDados();
        System.out.println("  Produto 2  ");
        p2.exibirDados();
    }

}
