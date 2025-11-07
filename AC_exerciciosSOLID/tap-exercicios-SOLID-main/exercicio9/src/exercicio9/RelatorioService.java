package exercicio9;

class RelatorioService {
    private GravadorDados destino;

    public RelatorioService(GravadorDados destino) {
        this.destino = destino;
    }

    public void gerarRelatorio() {
        this.destino.salvar("Relatório de vendas");
    }
}
