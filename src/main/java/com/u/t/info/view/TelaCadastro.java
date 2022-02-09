package com.u.t.info.view;
import javax.swing.*;

/**
 *
 * @author Nikolas
 */
public abstract class TelaCadastro extends JFrame {

    private JTextField rua, bairro, cidade, uf, cep;

    public abstract void desenha();

    public JTextField getRua() {
        return rua;
    }

    public void setRua(JTextField rua) {
        this.rua = rua;
    }

    public JTextField getBairro() {
        return bairro;
    }

    public void setBairro(JTextField bairro) {
        this.bairro = bairro;
    }

    public JTextField getCidade() {
        return cidade;
    }

    public void setCidade(JTextField cidade) {
        this.cidade = cidade;
    }

    public JTextField getUf() {
        return uf;
    }

    public void setUf(JTextField uf) {
        this.uf = uf;
    }

    public JTextField getCep() {
        return cep;
    }

    public void setCep(JTextField cep) {
        this.cep = cep;
    }

}
