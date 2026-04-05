package geometria;

public class Circunferencia extends Forma {

    protected float raio;

    public Circunferencia(float raio) {
        this.raio = raio;
    }

    public float getCircunferencia() {
        return raio;
    }

    public void setCircunferencia(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        return (float) (Math.PI * (raio * raio));
    }

    @Override
    public float perimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public void mostra() {
        System.out.println("--- Circunferencia ---");
        System.out.println("Raio: " + raio);
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
}
