
package entidade;

import java.sql.SQLException;
import persistencia.BD;

public class ItensVenda {
    int código;
    float quantidade, valor_unit, valor_total_itens;
    Venda venda;
    Produto produto;

    public ItensVenda(int código, float quantidade, float valor_unit, float valor_total_itens, Venda venda, Produto produto) {
        this.código = código;
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
        this.valor_total_itens = valor_total_itens;
        this.venda = venda;
        this.produto = produto;
    }

    public ItensVenda(float quantidade, float valor_unit, float valor_total_itens, Produto produto) {
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
        this.valor_total_itens = valor_total_itens;
        this.produto = produto;
    }

    public ItensVenda(float quantidade, float valor_unit, float valor_total_itens, Venda venda, Produto produto) {
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
        this.valor_total_itens = valor_total_itens;
        this.venda = venda;
        this.produto = produto;
    }
    
    public int getCódigo() {
        return código;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public float getValor_unit() {
        return valor_unit;
    }

    public float getValor_total_itens() {
        return valor_total_itens;
    }

    public Venda getVenda() {
        return venda;
    }

    public Produto getProduto() {
        return produto;
    }
    
public static String insereVendaItem(ItensVenda itens){
    String sql = "INSERT INTO itens_venda(qtd_itens_venda,"
            + "valor_un_itens_venda,valor_total_itens_venda,venda_cod,produtos_cod)VALUES("
            + itens.getQuantidade()+","+itens.getValor_unit()+","+itens.getValor_total_itens()
            +","+itens.getVenda().getCódigo()+","+itens.getProduto().getCódigo()+");";
        try {
            BD.comando.executeUpdate(sql);
            return "";
        } catch (SQLException ex) {
            return "Erro na inserção no Banco de Dados "+ex;
        }
    
}     public static String eleminaVenda(int código) {
        String sql = "DELETE FROM venda WHERE cod_venda=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção " + ex.getMessage();
        }
    }
    
}
