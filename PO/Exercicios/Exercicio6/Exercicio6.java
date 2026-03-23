package exercicio6;

import java.time.LocalDate;

public class Exercicio6 {

    public static void main(String[] args) {
//        Coletar ano atual para calcular a idade
        int anoAtual = LocalDate.now().getYear();

        Paciente p1 = new Paciente();
        Paciente p2 = new Paciente("Maria", "12345678-9", "Rua Brasil 01", "4002-8922", 2000, "Atendente");

        p1.cadastraDados();

        p1.imprimeDados();
        System.out.println("Idade: " + p1.calculaIdade(anoAtual));

        p2.imprimeDados();
        System.out.println("Idade: " + p2.calculaIdade(anoAtual));

    }

}
