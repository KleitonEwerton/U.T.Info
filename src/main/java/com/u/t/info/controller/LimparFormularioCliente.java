package com.u.t.info.controller;

import com.u.t.info.view.TelaCadastroCliente;

/**
 *
 * @author Nikolas
 */
public class LimparFormularioCliente {

    private final TelaCadastroCliente tela;

    public LimparFormularioCliente(TelaCadastroCliente tela) {
        this.tela = tela;
    }

    public void LimparFormulario() {
        tela.getNome().setText("");
        tela.getCpf().setText("");
        tela.getCep().setText("");
        tela.getRua().setText("");
        tela.getNumeroCasa().setText("");
        tela.getBairro().setText("");
        tela.getCidade().setText("");
        tela.getUf().setText("");
        tela.getTel1().setText("");
        tela.getTel().clearSelection();
        tela.repaint();
    }

}
