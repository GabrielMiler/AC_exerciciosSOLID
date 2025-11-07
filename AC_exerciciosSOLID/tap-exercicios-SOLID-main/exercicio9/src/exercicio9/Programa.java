package exercicio9;
public class Programa {
    public static void main(String[] args) {
        RelatorioService service1 = new RelatorioService(new BancoDeDados());
        RelatorioService service2 = new RelatorioService(new Diretorio());
        service1.gerarRelatorio();
        service2.gerarRelatorio();
    }
}
