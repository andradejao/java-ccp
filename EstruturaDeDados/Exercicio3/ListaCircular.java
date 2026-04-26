package listacircular;

import java.util.LinkedList;
import java.util.Queue;

public class ListaCircular {

    public static void main(String[] args) {
// 	  Utilizado Queue para definir o padrão de fila
        Queue<String> fila_45170843 = new LinkedList<>();

//        Início da fila circular         
        fila_45170843.add("Cliente A");
        fila_45170843.add("Cliente B");
        fila_45170843.add("Cliente C");
        System.out.println("Inicial: " + fila_45170843);
//        Adicionando novos valores
        fila_45170843.add("Cliente D");
        System.out.println("\nApos D: " + fila_45170843);
//        Adiciona Cliente D no final da fila
//        [Cliente A, Cliente B, Cliente C, Cliente D]
        fila_45170843.add("Cliente E");
        System.out.println("Apos E: " + fila_45170843);
//        Adiciona Cliente E no final da fila
//        [Cliente A, Cliente B, Cliente C, Cliente D, Cliente E]
        fila_45170843.poll();
        System.out.println("Apos remover o primeiro: " + fila_45170843);
//        Remove Cliente A (Primeira Posição)
//        [Cliente B, Cliente C, Cliente D, Cliente E]
        fila_45170843.add("Cliente F");
        System.out.println("Apos F:" + fila_45170843);
//        Adiciona Cliente F no final da fila
//        [Cliente B, Cliente C, Cliente D, Cliente E, Cliente F]
        fila_45170843.add("Jorge");
        System.out.println("Apos Jorge: " + fila_45170843);
//        Adiciona o cliente adicional Jorge no final da fila
//        [Cliente B, Cliente C, Cliente D, Cliente E, Cliente F, Jorge]
        fila_45170843.add(fila_45170843.poll());
        System.out.println("Apos B para o final: " + fila_45170843);
//        Remove o primeiro (Cliente B) e adiciona no final da fila
//        [Cliente C, Cliente D, Cliente E, Cliente F, Jorge, Cliente B]
        fila_45170843.add("Cliente G");
        System.out.println("Apos G: " + fila_45170843);
//        Adiciona o Cliente G no final da fila
//        [Cliente C, Cliente D, Cliente E, Cliente F, Jorge, Cliente B, Cliente G]
        fila_45170843.add("Maria");
//        Adiciona a cliente adicional Maria no final da fila
//        [Cliente C, Cliente D, Cliente E, Cliente F, Jorge, Cliente B, Cliente G, Maria]
        System.out.println("\nFinal: " + fila_45170843);
    }

}
