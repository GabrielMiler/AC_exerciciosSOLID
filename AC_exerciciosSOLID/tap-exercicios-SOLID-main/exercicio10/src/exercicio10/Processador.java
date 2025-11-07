package exercicio10;

class Processador {
    private LeitorDados leitor;

    public Processador(LeitorDados leitor) {
        this.leitor = leitor;
    }

    public void processar() {
        System.out.println(leitor.lerDados());
    }
}
