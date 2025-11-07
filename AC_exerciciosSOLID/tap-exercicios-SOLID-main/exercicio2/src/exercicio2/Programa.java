package exercicio2;
public class Programa {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("ATA de Reunião");
        GeradorDeArquivo gerador = new GeradorDeArquivo();
        relatorio.gerar();
        gerador.salvarRelatorio(relatorio);
    }
}
