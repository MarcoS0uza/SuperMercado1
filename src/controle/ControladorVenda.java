/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Usuario;
import entidade.Venda;
import interfaces.JanelaVenda;

/**
 *
 * @author MARCOANTONIO
 */
public class ControladorVenda {

    public ControladorVenda() {
        new JanelaVenda(this).setVisible(true);
    }
    
    
        public String inserirVenda(Venda venda) {
        Venda venda1;
        venda1 = Venda.buscarVenda(venda.getCódigo());
        if (venda1 == null) {
            return Venda.inserirVenda(venda);
        } else {
            return "Já existe uma venda com esse código";
        }
    }

    public String alterarCliente(Venda venda) {
        Venda venda1;
        venda1 = Venda.buscarVenda(venda.getCódigo());
        if (venda1 != null) {
            return Venda.alterarVenda(venda);
        } else {
            return "Cliente não cadastrado";
        }

    }

    public String removerVenda(int código) {
        Venda venda1;
        venda1 = Venda.buscarVenda(código);
        if (venda1 != null) {
            return Venda.eleminarVenda(código);
        } else {
            return "Cliente não cadastrado";
        }
    }

}
