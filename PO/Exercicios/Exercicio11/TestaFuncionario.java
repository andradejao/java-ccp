package testafuncionario;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {
        int senha;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha do gerente: ");
        senha = sc.nextInt();

        Gerente g = new Gerente(senha, 16, "Ziraldo Antunes", "12345678901", 5000);
        Caixa c = new Caixa();

//        Valores instanciados dessa forma devido a falta do Get e Set no diagrama
        c.nome = "Maria do Carmo";
        c.cpf = "98765432101";
        c.salario = 2000;

        if (g.autentica() == true) {
            System.out.println("Salário do gerente: " + g.salario
                    + "\nBonificação: " + g.bonificacao()
                    + "\nSalário final: " + (g.salario + g.bonificacao()));
            System.out.println("Salário do caixa: " + c.salario
                    + "\nBonificação: " + c.bonificacao()
                    + "\nSalário final: " + (c.salario + c.bonificacao()));

        } else {
            System.out.println("Acesso negado!");
        }

    }

}
