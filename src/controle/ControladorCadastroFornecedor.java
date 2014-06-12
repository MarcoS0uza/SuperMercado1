/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Fornecedor;
import interfaces.JanelaCadastroFornecedor;

/**
 *
 * @author MARCOANTONIO
 */
public class ControladorCadastroFornecedor {

    public ControladorCadastroFornecedor() {
        new JanelaCadastroFornecedor(this).setVisible(true);
    }

    public String inserirFornecedor(Fornecedor fornecedor) {
        Fornecedor fornecedor1;
        fornecedor1 = Fornecedor.buscarFornecedor(fornecedor.getCódigo());
        if (fornecedor1 == null) {
            return Fornecedor.inserirFornecedor(fornecedor);
        } else {
            return "Fornecedor já Cadastrado";
        }
    }

    public String alterarFornecedor(Fornecedor fornecedor) {
        Fornecedor fornecedor1;
        fornecedor1 = Fornecedor.buscarFornecedor(fornecedor.getCódigo());
        if (fornecedor1 != null) {
            return Fornecedor.alterarFornecedor(fornecedor);
        } else {
            return "Fornecedor não cadastrado";
        }

    }

    public String removerFornecedor(int código) {
        Fornecedor fornecedor1;
        fornecedor1 = Fornecedor.buscarFornecedor(código);
        if (fornecedor1 != null) {
            return Fornecedor.eleminarFornecedor(código);
        } else {
            return "Fornecedor não cadastrado";
        }
    }
}
