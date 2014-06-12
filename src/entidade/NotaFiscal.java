/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

/**
 *
 * @author MARCOANTONIO
 */
public class NotaFiscal {
 String chave, data_emissao, infAdicionais;
 int modelo, serie, numero_NF;
 float base_calc_icms, vIcms, base_calculo_ST, vST, total_produtos, vFrete, vSeguro, vDesc, vIPI, vOutros, vNF;
 Fornecedor fornecedor;

    public NotaFiscal(String chave, String data_emissao, String infAdicionais, int modelo, int serie, int numero_NF, float base_calc_icms, float vIcms, float base_calculo_ST, float vST, float total_produtos, float vFrete, float vSeguro, float vDesc, float vIPI, float vOutros, float vNF, Fornecedor fornecedor) {
        this.chave = chave;
        this.data_emissao = data_emissao;
        this.infAdicionais = infAdicionais;
        this.modelo = modelo;
        this.serie = serie;
        this.numero_NF = numero_NF;
        this.base_calc_icms = base_calc_icms;
        this.vIcms = vIcms;
        this.base_calculo_ST = base_calculo_ST;
        this.vST = vST;
        this.total_produtos = total_produtos;
        this.vFrete = vFrete;
        this.vSeguro = vSeguro;
        this.vDesc = vDesc;
        this.vIPI = vIPI;
        this.vOutros = vOutros;
        this.vNF = vNF;
        this.fornecedor = fornecedor;
    }

    public String getChave() {
        return chave;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public String getInfAdicionais() {
        return infAdicionais;
    }

    public int getModelo() {
        return modelo;
    }

    public int getSerie() {
        return serie;
    }

    public int getNumero_NF() {
        return numero_NF;
    }

    public float getBase_calc_icms() {
        return base_calc_icms;
    }

    public float getvIcms() {
        return vIcms;
    }

    public float getBase_calculo_ST() {
        return base_calculo_ST;
    }

    public float getvST() {
        return vST;
    }

    public float getTotal_produtos() {
        return total_produtos;
    }

    public float getvFrete() {
        return vFrete;
    }

    public float getvSeguro() {
        return vSeguro;
    }

    public float getvDesc() {
        return vDesc;
    }

    public float getvIPI() {
        return vIPI;
    }

    public float getvOutros() {
        return vOutros;
    }

    public float getvNF() {
        return vNF;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

  


               
    
}
