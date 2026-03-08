package exercicio2;

public class Produto {

    String marca;
    String fabricante;
    String codBarras;
    float preco;

    public Produto() {
    }

    public Produto(String m, String f, String c, float p) {
        this.marca = m;
        this.fabricante = f;
        this.codBarras = c;
        this.preco = p;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Código de barras: " + codBarras);
        System.out.println("Preço: " + preco);
    }
}
