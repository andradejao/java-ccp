package geometria;

public class Retangulo extends Triangulo {

    public Retangulo(float base, float altura) {
        super(base, altura);
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
        System.out.println("--- Retangulo ---");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }

}
