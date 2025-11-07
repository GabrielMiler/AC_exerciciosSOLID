package exercicio4;

public class Retangulo implements Forma {
    double largura, altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double aplicarFormula() {
        return this.largura * this.altura;
    }
}
