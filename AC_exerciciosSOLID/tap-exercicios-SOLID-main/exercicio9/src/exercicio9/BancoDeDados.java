package exercicio9;

class BancoDeDados implements GravadorDados {
    public void salvar(String dados) {
        System.out.println("Salvando no banco: " + dados);
    }
}

