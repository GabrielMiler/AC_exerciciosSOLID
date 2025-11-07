package exercicio7;
public class Programa {
    public static void main(String[] args) {
        Caminhoneiro caminhoneiro = new Caminhoneiro();
        Desenvolvedor dev = new Desenvolvedor();
        dev.trabalhar();
        caminhoneiro.trabalhar();
        caminhoneiro.dirigir();
    }


}
