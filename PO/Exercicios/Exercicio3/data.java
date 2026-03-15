package principal;

public class Data {

    int dia;
    int mes;
    int ano;

    public Data() {
    }

    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void cadastrarDados(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    public void imprimeData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
