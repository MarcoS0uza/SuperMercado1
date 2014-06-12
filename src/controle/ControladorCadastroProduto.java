
package controle;

import entidade.Produto;
import interfaces.JanelaCadastroProduto;

public class ControladorCadastroProduto {
     public ControladorCadastroProduto() {
        new JanelaCadastroProduto(this).setVisible(true);
    }

    public String inserirProduto(Produto produto) {
        Produto produto1;
        produto1 = Produto.buscarProduto(produto.getCódigo());
        if (produto1 == null) {
            return Produto.inserirProduto(produto);
        } else {
            return "Produto já Cadastrado";
        }
    }

    public String alterarProduto(Produto produto) {
        Produto produto1;
        produto1 = Produto.buscarProduto(produto.getCódigo());
        if (produto1 != null) {
            return Produto.alterarProduto(produto);
        } else {
            return "Produto não cadastrado";
        }

    }

    public String removerProduto(int código) {
        Produto produto1;
        produto1 = Produto.buscarProduto(código);
        if (produto1 != null) {
            return Produto.eleminarProduto(código);
        } else {
            return "Produto não cadastrado";
        }
    }
}
