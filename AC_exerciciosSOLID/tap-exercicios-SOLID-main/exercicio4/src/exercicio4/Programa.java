package exercicio4;
public class Programa {
    public static void main(String[] args) {
        CalculadoraArea calc = new CalculadoraArea();

        System.out.println("Área do círculo: " + calc.calcularArea(new Circulo(5)));
        System.out.println("Área do retângulo: " + calc.calcularArea(new Retangulo(4, 6)));
    }
}

