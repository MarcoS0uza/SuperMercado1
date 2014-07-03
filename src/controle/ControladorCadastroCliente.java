package controle;

import entidade.Cliente;
import interfaces.JanelaCadastroCliente;

public class ControladorCadastroCliente {
    
    
    public ControladorCadastroCliente() {
        new JanelaCadastroCliente(this).setVisible(true);
 
    }

    public String inserirCliente(Cliente cliente) {
        Cliente cliente1;
        String result;
        cliente1 = Cliente.buscarCliente(cliente.getCódigo());
        if (cliente1 == null) {
            result = Cliente.verificaDocCadastro(cliente.getN_documento());
            if(result == null){
                return Cliente.inserirCliente(cliente);
            }else{
                return result;
            }
            
        } else {
            return "Código já inserido";
        }
    }

    public String alterarCliente(Cliente cliente) {
        Cliente cliente1;
        cliente1 = Cliente.buscarCliente(cliente.getCódigo());
        if (cliente1 != null) {
            return Cliente.alterarCliente(cliente);
        } else {
            return "Cliente não cadastrado";
        }

    }

    public String removerCliente(int código) {
        Cliente cliente1;
        cliente1 = Cliente.buscarCliente(código);
        if (cliente1 != null) {
            return Cliente.eleminarCliente(código);
        } else {
            return "Cliente não cadastrado";
        }
    }

}
