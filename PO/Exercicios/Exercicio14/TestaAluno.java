package testaaluno;

import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        int qtdeAlunos, qtdeNotas;
        float mediaGeral = 0;
        Aluno alunos[]; // vetor de objetos

        qtdeAlunos = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite a quantidade de alunos da turma")
        );

        alunos = new Aluno[qtdeAlunos];

        for (int i = 0; i < alunos.length; i++) {
            qtdeNotas = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Digite a quantidade de notas do aluno " + (i + 1))
            );

            alunos[i] = new Aluno(qtdeNotas);
            alunos[i].leitura();
            mediaGeral += alunos[i].calculaMedia();
            alunos[i].print();
        }

        System.out.println("Média geral da turma:\n" + (mediaGeral / qtdeAlunos));
    }

}
