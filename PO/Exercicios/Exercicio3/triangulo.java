package principal;

public class Triangulo {
    float base;
    float altura;

    public Triangulo() {
    }

    public Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }

    public float calculaArea() {
        return (base * altura) / 2;
    }

    public void imprimeDados() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calculaArea());
    }
}
