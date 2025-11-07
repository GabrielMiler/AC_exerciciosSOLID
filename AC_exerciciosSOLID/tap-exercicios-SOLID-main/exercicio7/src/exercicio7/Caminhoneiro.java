package exercicio7;

class Caminhoneiro implements Trabalhador, Motorista {
    public void trabalhar() {
        System.out.println("Transportando cargas...");
    }

    public void dirigir() {
        System.out.println("Dirigindo caminhão...");
    }
}