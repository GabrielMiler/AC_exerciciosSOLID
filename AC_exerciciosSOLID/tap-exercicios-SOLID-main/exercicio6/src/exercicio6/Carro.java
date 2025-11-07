package exercicio6;

public class Carro extends Veiculo{
    public void mover() {
        System.out.println("Carro andando...");
        acelerar();
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }
}
