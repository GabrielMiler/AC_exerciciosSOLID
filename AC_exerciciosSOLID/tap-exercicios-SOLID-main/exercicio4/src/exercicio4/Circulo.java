package exercicio4;

public class Circulo implements Forma{
    double raio;
    Circulo(double raio) { this.raio = raio; }

    public double aplicarFormula() {
        return Math.PI * this.raio * this.raio;
    }
}
