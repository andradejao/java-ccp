package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
//        Criando o scanner
        Scanner sc = new Scanner(System.in);

//  Criando os objetos          
        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente("José da Silva");

//    Preenchendo com os dados coletados
        System.out.println("Digite o seu nome: ");
        p1.nome = sc.nextLine();
        System.out.println("Digite o seu rg: ");
        p1.rg = sc.nextLine();
        System.out.println("Digite o seu endereço: ");
        p1.endereco = sc.nextLine();
        System.out.println("Digite o seu telefone: ");
        p1.telefone = sc.nextLine();
        System.out.println("Digite a sua data de nascimento: ");
        p1.dataNascimento = sc.nextLine();
        System.out.println("Digite a sua profissão: ");
        p1.profissao = sc.nextLine();

//        Paciente 2
        System.out.println("  Paciente 2  ");
        System.out.println("Digite o seu rg: ");
        p2.rg = sc.nextLine();
        System.out.println("Digite o seu endereço: ");
        p2.endereco = sc.nextLine();
        System.out.println("Digite o seu telefone: ");
        p2.telefone = sc.nextLine();
        System.out.println("Digite a sua data de nascimento: ");
        p2.dataNascimento = sc.nextLine();
        System.out.println("Digite a sua profissão: ");
        p2.profissao = sc.nextLine();

//        Chamando a função para mostrar os dados
        p1.exibirDados();
        System.out.println("  Paciente 2  ");
        p2.exibirDados();
    }

}
