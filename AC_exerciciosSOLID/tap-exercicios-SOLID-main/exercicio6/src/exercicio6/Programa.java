package exercicio6;
public class Programa {
    public static void main(String[] args) {
        Veiculo bike = new Bicicleta();
        Veiculo carro = new Carro();
        bike.mover();
        carro.mover();
    }
}
