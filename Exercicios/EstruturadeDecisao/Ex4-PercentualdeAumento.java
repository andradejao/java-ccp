package com.mycompany.exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int codigo;
        double salario;
        double aumento;
        double salarioComAumento;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do cargo: ");
        codigo = sc.nextInt();

        System.out.print("Digite o salario atual: ");
        salario = sc.nextDouble();

        switch (codigo) {
            case 1:
// Multiplica o salário antigo pela porcentagem de aumento e armazena na variável
                aumento = salario * 0.50;
// Soma o salario com o aumento e armazena na variável                    
                salarioComAumento = salario + aumento;
                System.out.println("Cargo: Escriturário");
                System.out.println("Aumento de: R$" + aumento);
                System.out.println("Novo salário: R$" + salarioComAumento);
                break;
            case 2:
// Multiplica o salário antigo pela porcentagem de aumento e armazena na variável
                aumento = salario * 0.35;
// Soma o salario com o aumento e armazena na variável                    
                salarioComAumento = salario + aumento;
                System.out.println("Cargo: Secretário");
                System.out.println("Aumento de: R$" + aumento);
                System.out.println("Novo salário: R$" + salarioComAumento);
                break;
            case 3:
// Multiplica o salário antigo pela porcentagem de aumento e armazena na variável
                aumento = salario * 0.20;
// Soma o salario com o aumento e armazena na variável                    
                salarioComAumento = salario + aumento;
                System.out.println("Cargo: Caixa");
                System.out.println("Aumento de: R$" + aumento);
                System.out.println("Novo salário: R$" + salarioComAumento);
                break;
            case 4:
// Multiplica o salário antigo pela porcentagem de aumento e armazena na variável
                aumento = salario * 0.10;
// Soma o salario com o aumento e armazena na variável                    
                salarioComAumento = salario + aumento;
                System.out.println("Cargo: Gerente");
                System.out.println("Aumento de: R$" + aumento);
                System.out.println("Novo salário: R$" + salarioComAumento);
                break;
            case 5:
                System.out.println("O cargo de Diretor não possui percentual de aumento");
                return;
            default:
                System.out.println("Código de cargo inválido!");
                return;
        }
    }
}
