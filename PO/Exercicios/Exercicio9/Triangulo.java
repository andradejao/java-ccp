package geometria;

public class Triangulo extends Forma {

    protected float base;
    protected float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float area() {
        return base * altura;
    }

    @Override
    public float perimetro() {
        return (base + altura) * 2;
    }

    @Override
    public void mostra() {
        System.out.println("--- Triangulo ---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
}
