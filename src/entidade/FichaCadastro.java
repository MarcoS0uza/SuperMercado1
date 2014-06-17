package entidade;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.text.MaskFormatter;

public class FichaCadastro {

    public static enum UF {

        AC, AL, AP, AM, BA, CE, DF, ES, GO, MA,
        MT, MS, MG, PA, PB, PR, PE, PI, RR, RO,
        RJ, RN, RS, SC, SP, SE, TO
    };

    public static enum Sexo {

        Masculino, Feminino
    };

    public static enum Unidade {

        UN, KG, CX, DZ, MT, SC, PC, FD, L, LT, M2, M3, MDZ, ML, MM, PAR  
    };

    public static enum Cargo {

        Caixa, Gerente, Administrador
    };

    protected int código, numero;
    protected String nome, n_documento, endereço, bairro, telefone, cep, estado, cidade, email, data_cadastro;

    public FichaCadastro(int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        this.código = código;
        this.numero = numero;
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        this.n_documento = n_documento;
        this.endereço = endereço;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
    }

//Construtor para ser mostrado na tabela
    public FichaCadastro(int código, String nome, String data_cadastro, String n_documento) {
        this.código = código;
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        this.n_documento = n_documento;
    }

    public FichaCadastro(int código) {
        this.código = código;
    }

    public FichaCadastro() {
    }
    

    public static String getDataAtual() {
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
        return dataAtual.format(new Date());
    }

    public static String getHoraAtual() {
        SimpleDateFormat horaAtual = new SimpleDateFormat("hh:mm:ss");
        return horaAtual.format(new Date());
    }

    public static String formatarString(String texto, String mascara) throws ParseException {
        MaskFormatter mf = new MaskFormatter(mascara);
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(texto);
    }

    @Override
    public String toString() {
        return "FichaCadastro{" + "c\u00f3digo=" + código + ", numero=" + numero + ", nome=" + nome + ", n_documento=" + n_documento + ", endere\u00e7o=" + endereço + ", bairro=" + bairro + ", telefone=" + telefone + ", cep=" + cep + ", estado=" + estado + ", cidade=" + cidade + ", email=" + email + ", data_cadastro=" + data_cadastro + '}';
    }

}
