package exercicio8;

class Cachorro implements Animal, Terrestre, Nadador {
    public void nadar() { System.out.println("Nadando..."); }
    public void andar() { System.out.println("Andando..."); }
    public void mover() {
        System.out.println("Movendo...");
    }
}