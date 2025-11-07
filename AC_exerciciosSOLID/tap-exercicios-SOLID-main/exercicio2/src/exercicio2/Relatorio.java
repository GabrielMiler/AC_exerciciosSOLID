package exercicio2;

public class Relatorio {
    private String nome;

    public Relatorio(String nome) {
        this.nome = nome;
    }

    public void gerar() {
        System.out.println("Gerando relatório...");
    }

    public String getNome() {
        return nome;
    }
}

