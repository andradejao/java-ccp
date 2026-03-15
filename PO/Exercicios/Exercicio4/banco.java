package banco;

public class Banco {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("Joao Vitor", 1000, 500, 'C');
        ContaCorrente c2 = new ContaCorrente("Andrade de Miranda", 250, 'P');

        c1.depositar(200);
        c2.sacar(100);

        System.out.println(c1.imprimeDados());
        System.out.println();
        System.out.println(c2.imprimeDados());
    }
}
