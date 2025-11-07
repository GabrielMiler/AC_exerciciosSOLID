package exercicio1;

public class CadastroUsuario {

    public void cadastrar(String nome, String email, String senha) {
        ValidadorDeSenha validaSenha = new ValidadorDeSenha();

        if (validaSenha.validarSenha(senha)) {
            GeradorEmail enviaEmail = new GeradorEmail();
            Usuario usuario = new Usuario();

            usuario.setNome(nome);
            usuario.setEmail(email);
            System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());
            enviaEmail.enviarEmailBoasVindas(usuario);
        } else {
            System.out.println("Senha inválida, usuário não está cadastrado.");
        }
    }
}
