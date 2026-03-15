package principal;

public class Principal {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(10, 5);
        Triangulo t2 = new Triangulo(8, 4);

        t1.imprimeDados();
        t2.imprimeDados();

        Data data1 = new Data(15, 3, 2026);
        Data data2 = new Data();

        data2.cadastrarDados(11, 11, 2004);

        data1.imprimeData();
        data2.imprimeData();
    }
}
