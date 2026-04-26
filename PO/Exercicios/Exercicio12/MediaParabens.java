package mediaparabens;

import javax.swing.JOptionPane;

public class MediaParabens {

    public static void main(String[] args) {
        float[] nota = new float[3];
        String[] nome = new String[3];
        float soma = 0, media;

        for (int i = 0; i < 3; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite o nome do " + (i + 1) + "º aluno");

            nota[i] = Float.parseFloat(
                    JOptionPane.showInputDialog(null, "Digite a nota do aluno " + nome[i])
            );

            soma += nota[i];
        }

        media = soma / 3;

        for (int i = 0; i < 3; i++) {
            if (nota[i] > media) {
                System.out.println("Parabens " + nome[i]);
            }
        }
    }

}
