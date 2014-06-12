package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.BD;

public class Venda {

    int código;
    String data_venda, hora_venda, status;
    float total_venda_liq, acrescimo, desconto, total_venda_bruta;
    Cliente cliente;

    public Venda(int código, String data_venda, String hora_venda, float total_venda_liq, Cliente cliente, String status, float acrecimo, float desconto, float total_venda_bruta) {
        this.código = código;
        this.data_venda = data_venda;
        this.hora_venda = hora_venda;
        this.status = status;
        this.total_venda_liq = total_venda_liq;
        this.cliente = cliente;
        this.acrescimo = acrecimo;
        this.desconto = desconto;
        this.total_venda_bruta = total_venda_bruta;
        
    }

    public float getAcrescimo() {
        return acrescimo;
    }

    public float getDesconto() {
        return desconto;
    }

    public float getTotal_venda_bruta() {
        return total_venda_bruta;
    }

    public String getStatus() {
        return status;
    }

    public int getCódigo() {
        return código;
    }

    public String getData_venda() {
        return data_venda;
    }

    public String getHora_venda() {
        return hora_venda;
    }

    public float getTotal_venda_liq() {
        return total_venda_liq;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Métodos para inserção,alteração,remoção e consulta no BD.
    public static String inserirVenda(Venda venda) {
        DateFormat dv = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "INSERT INTO venda(cod_venda,data_venda,hora_venda,total_venda_liq,clientes_cod,status,acrescimo,desconto,total_venda_bruta)"
                + "VALUES(" + venda.getCódigo() + ",'" + dv.format(Date.parse(venda.getData_venda())) + "','" + venda.getHora_venda()
                + "'," + venda.getTotal_venda_liq()+ "," + venda.getCliente().getCódigo() + ",'" + venda.getStatus() + "',"
                + venda.getAcrescimo()+","+venda.getDesconto()+","+venda.getTotal_venda_bruta()+");";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na inserção no Banco de Dados"+ex;
        }
    }

    public static Venda buscarVenda(int codigo) {
        DateFormat dv = new SimpleDateFormat("dd/MM/yyyy");
        String sql = "SELECT * FROM venda WHERE cod_venda=" + codigo;
        ResultSet rs;
        Venda venda = null;
        try {
            rs = BD.comando.executeQuery(sql);
            while (rs.next()) {
                venda = new Venda(
                        rs.getInt("cod_venda"),
                        dv.format(rs.getDate("data_venda")).toString(),
                        rs.getString("hora_venda"),
                        rs.getFloat("total_venda_liq"),
                        (Cliente) rs.getObject("clientes_cod"),
                        rs.getString("status"),
                        rs.getFloat("acrescimo"),
                        rs.getFloat("desconto"),
                        rs.getFloat("total_venda_bruta")
                );
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return venda;
    }

    public static String alterarVenda(Venda venda) {
        DateFormat dv = new SimpleDateFormat("yyyy-MM-dd");
        String sql = "UPDATE venda SET total_venda=" + venda.getTotal_venda_liq()+ ",clientes_cod="
                + venda.getCliente().getCódigo() + ",status='" + venda.getStatus() + "';";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException e) {
            return "Erro na alteração da venda no Banco de Dados\n" + e.getMessage();
        }
    }
    
        public static String eleminarVenda(int código) {
        String sql = "DELETE FROM venda WHERE cod_venda=" + código + ";";
        try {
            BD.comando.executeUpdate(sql);
            return null;
        } catch (SQLException ex) {
            return "Erro na Remoção da venda no Banco de Dados\n" + ex.getMessage();
        }
    }
   public static String id() {
        String codigo = null;
        try {
            String sql = "select max(cod_venda) from venda;";
            ResultSet rs = (ResultSet) BD.comando.executeQuery(sql);
            while (rs.next()) {
                codigo = String.valueOf((rs.getInt(1) + 1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return codigo;
    }

}
