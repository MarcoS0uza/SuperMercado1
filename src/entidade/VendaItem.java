
package entidade;

public class VendaItem {
  int cod,qtd_itens;
  float valor_unit, total_itens;
  Venda venda;
  Produto produto;

    public VendaItem(int cod, int qtd_itens, float valor_unit, float total_itens, Venda venda, Produto produto) {
        this.cod = cod;
        this.qtd_itens = qtd_itens;
        this.valor_unit = valor_unit;
        this.total_itens = total_itens;
        this.venda = venda;
        this.produto = produto;
    }

    public int getCod() {
        return cod;
    }

    public int getQtd_itens() {
        return qtd_itens;
    }

    public float getValor_unit() {
        return valor_unit;
    }

    public float getTotal_itens() {
        return total_itens;
    }

    public Venda getVenda() {
        return venda;
    }

    public Produto getProduto() {
        return produto;
    }
  
    
}
