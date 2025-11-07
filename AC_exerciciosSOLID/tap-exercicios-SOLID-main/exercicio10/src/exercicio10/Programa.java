package exercicio10;
public class Programa {
    public static void main(String[] args) {
        Processador processador1 = new Processador(new LeitorDispositivos());
        Processador processador2 = new Processador(new LeitorArquivos());
        processador1.processar();
        processador2.processar();
    }
}