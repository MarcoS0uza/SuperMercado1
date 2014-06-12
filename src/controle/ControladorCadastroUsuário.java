 package controle;
 
 import entidade.Usuario;
import interfaces.JanelaCadastroUsuário;
 
 public class ControladorCadastroUsuário
 {
   public ControladorCadastroUsuário() {
        new JanelaCadastroUsuário(this).setVisible(true);
    }

    public String inserirUsuário(Usuario usuário) {
        boolean jaTem;
        jaTem = Usuario.nomeIgual(usuário.getNome());
        if (jaTem == true) {
            return Usuario.inserirUsuário(usuário);
        } else {
            return "Usuário já Cadastrado";
        }
    }

    public String alterarUsuário(Usuario usuário) {
        Usuario usuário1;
        usuário1 = Usuario.verificaUsuário(usuário.getCódigo());
        if (usuário1 != null) {
            return Usuario.alterarUsuário(usuário);
        } else {
            return "Usuário não cadastrado";
        }

    }

    public String removerUsuário(String nome) {
        Usuario usuário1;
        usuário1 = Usuario.buscarUsuário(nome);
        if (usuário1 != null) {
            return Usuario.eleminarUsuário(nome);
        } else {
            return "Usuário não cadastrado";
        }
    }
 }

