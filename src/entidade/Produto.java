package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.BD;

public class Produto {

    private int código;
    private float preço_custo, preço_venda,estoque;
    private String nome, url_imagem, unidade, marca;

    public Produto(int código,float estoque, float preço_custo, float preço_venda, String nome, String url_imagem, String unidade, String marca) {
        this.código = código;
        this.preço_custo = preço_custo;
        this.preço_venda = preço_venda;
        this.estoque = estoque;
        this.nome = nome;
        this.url_imagem = url_imagem;
        this.unidade = unidade;
        this.marca = marca;
    }

    public Produto(int código, String nome) {
        this.código = código;
        this.nome = nome;
    }

    public Produto(int código) {
        this.código = código;
    }

    public Produto() {
    }



    public Produto(int código, float estoque, float preço_venda, String nome, String marca) {
        this.código = código;
        this.estoque = estoque;
        this.preço_venda = preço_venda;
        this.nome = nome;
        this.marca = marca;
    }

    public int getCódigo() {
        return código;
    }

    public float getEstoque() {
        return estoque;
    }

    public float getPreço_custo() {
        return preço_custo;
    }

    public float getPreço_venda() {
        return preço_venda;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl_imagem() {
        return url_imagem;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getMarca() {
        return marca;
    }

    public static String inserirProduto(Produto produto) {

        String sql = "INSERT INTO produtos(nome_produto,preco_custo_produto,preco_venda_produto,"
                + "estoque_produto,imagem_produto,unidade_produto,marca_produto)VALUES"
                + "('" + produto.getNome() + "','" + produto.getPreço_custo() + "','"
                + produto.getPreço_venda() + "','" + produto.getEstoque() + "','" + produto.getUrl_imagem() + "','" + produto.getUnidade() + "','"
                + produto.getMarca() + "')";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro de inserção no Banco de Dados:  " + ex.getMessage();
        }
    }

    public static Produto buscarProduto(int código) {
        String sql = "SELECT * FROM produtos WHERE cod_produto = '" + código + "'";
        ResultSet lista_resultados;
        Produto produto = null;
        try {
            lista_resultados = BD.comando.executeQuery(sql);
            while (lista_resultados.next()) {
                produto = new Produto(
                        lista_resultados.getInt("cod_produto"),
                        lista_resultados.getFloat("estoque_produto"),
                        lista_resultados.getFloat("preco_custo_produto"),
                        lista_resultados.getFloat("preco_venda_produto"),
                        lista_resultados.getString("nome_produto"),
                        lista_resultados.getString("imagem_produto"),
                        lista_resultados.getString("unidade_produto"),
                        lista_resultados.getString("marca_produto"));
            }
            lista_resultados.close();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            produto = null;
        }
        return produto;
    }

    public static String id() {
        String codigo = null;
        try {
            String sql = "select max(cod_produto) from produtos;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

    public static ArrayList<Produto> visãoTabela() {
        String sql = "Select cod_produto,nome_produto,estoque_produto,preco_venda_produto,marca_produto from produtos";
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        try {
            ResultSet rs = BD.comando.executeQuery(sql);
            while (rs.next()) {

                Produto produto = new Produto(rs.getInt("cod_produto"),
                        rs.getFloat("estoque_produto"), rs.getFloat("preco_venda_produto"),
                        rs.getString("nome_produto"), rs.getString("marca_produto"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return produtos;
    }

    public static String alterarProduto(Produto produto) {
        String sql = "UPDATE produtos SET nome_produto='" + produto.getNome()
                + "',preco_custo_produto='" + produto.getPreço_custo()
                + "',preco_venda_produto='" + produto.getPreço_venda()
                + "',estoque_produto='" + produto.getEstoque()
                + "',imagem_produto='" + produto.getUrl_imagem() + "',unidade_produto='" + produto.getUnidade()
                + "',marca_produto='" + produto.getMarca() + "' WHERE cod_produto=" + produto.getCódigo() + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração do Produto no Banco de Dados\n" + e.getMessage();
        }
    }

    public static String eleminarProduto(int código) {
        String sql = "DELETE FROM produtos WHERE cod_produto=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção do Produto no Banco de Dados\n" + ex.getMessage();
        }
    }
}
