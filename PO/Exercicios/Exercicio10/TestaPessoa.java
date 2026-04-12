package testapessoa;

import javax.swing.JOptionPane;

public class TestaPessoa {

    public static void main(String[] args) {
        while (true) {
            Pessoa p = null;
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção: "
                    + "\n1 - Aluno"
                    + "\n2 - Professor"
                    + "\n3 - Funcionário"
                    + "\n9 - Sair"));
            switch (opcao) {
                case 1:
                    p = new Aluno();
                    break;
                case 2:
                    p = new Professor();
                    break;
                case 3:
                    p = new Funcionario();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    continue;
            }
            JOptionPane.showMessageDialog(null, p.mostraClasse());
        }

    }

}
