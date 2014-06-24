/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import entidade.Cliente;
import entidade.Venda;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import persistencia.BD;

/**
 *
 * @author MARCOANTONIO
 */
public class AbreRelatorio {

    public String caminho;

    public void rel_cliente(ArrayList<Cliente> clientes) {
        String sql;
        JasperViewer jv;
        try {

            if (clientes == null) {
                sql = "select c.cod_cliente,"
                        + "c.nome_cliente,"
                        + "c.n_documento_cliente,"
                        + "c.telefone_cliente,"
                        + "c.cidade_cliente,"
                        + "c.estado_cliente\n"
                        + "from clientes c ";

                JRResultSetDataSource relatorioResult = new JRResultSetDataSource(BD.comando.executeQuery(sql));
                JasperPrint mostra_rel = JasperFillManager.fillReport(caminho + "/Clientes.jasper", new HashMap(), relatorioResult);
                jv = new JasperViewer(mostra_rel, false);
                jv.setTitle("Relatório de Clientes");
                jv.setExtendedState(MAXIMIZED_BOTH);
                jv.show();
            } else {
               
                   
              
                
                //relatorioResult = new JRResultSetDataSource(BD.comando.executeQuery(sql));
                JRBeanCollectionDataSource relatorioResult = new JRBeanCollectionDataSource(clientes);
                
                JasperPrint mostra_rel = JasperFillManager.fillReport(caminho + "/Clientes.jasper", new HashMap(), relatorioResult);
                jv = new JasperViewer(mostra_rel, false);
                jv.setTitle("Relatório de Clientes");
                jv.setExtendedState(MAXIMIZED_BOTH);
                jv.show();
            }

        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }

    public void pedido(Venda venda) {
        try {
            String sql = "select cod_venda,data_venda,hora_venda,"
                    + "	total_venda_liq,\n"
                    + "	clientes_cod,\n"
                    + "	qtd_itens_venda,\n"
                    + "	valor_un_itens_venda,\n"
                    + "	valor_total_itens_venda,\n"
                    + "	produtos_cod,\n"
                    + "	nome_produto,\n"
                    + "	unidade_produto,\n"
                    + "	nome_cliente,\n"
                    + "	n_documento_cliente,\n"
                    + "	endereco_cliente,\n"
                    + "	numero_cliente,\n"
                    + "	bairro_cliente,\n"
                    + "	cep_cliente,\n"
                    + "	telefone_cliente,\n"
                    + "	estado_cliente,\n"
                    + "	cidade_cliente,\n"
                    + "acrescimo,\n"
                    + "desconto,\n"
                    + "total_venda_bruta,\n"
                    + "email_cliente\n"
                    + "from venda v\n"
                    + "left join itens_venda vi on vi.venda_cod=v.cod_venda\n"
                    + "left join produtos p on p.cod_produto=vi.produtos_cod\n"
                    + "left join clientes c on c.cod_cliente=v.clientes_cod\n"
                    + "where v.cod_venda=" + venda.getCódigo() + ";";
            JRResultSetDataSource relatorioResult = new JRResultSetDataSource(BD.comando.executeQuery(sql));
            JasperPrint mostra_rel = JasperFillManager.fillReport(caminho + "/Pedido.jasper", new HashMap(), relatorioResult);
            JasperViewer jv = new JasperViewer(mostra_rel, false);
            jv.setTitle("Pedidode de venda");
            jv.setExtendedState(MAXIMIZED_BOTH);
            jv.show();

        } catch (SQLException | JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar relatório: " + ex);
        }
    }

    public AbreRelatorio(String caminho) {
        this.caminho = caminho;

    }

}
