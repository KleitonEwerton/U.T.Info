package com.u.t.info.controller;


import com.u.t.info.view.TelaCadastroProduto;

public class LimparFormularioProduto {
    private final TelaCadastroProduto tela;

    public LimparFormularioProduto(TelaCadastroProduto tela) {
        this.tela = tela;
    }

    public void LimparFormulario() {
        tela.getNome().setText("");
        tela.getCodigo().setText("");
        tela.getCustoCompra().setText("");
        tela.getCustoVenda().setText("");
        tela.getDescricao().setText("");
        tela.getModelo().setText("");
        tela.getEstoqueInicial().setText("");
        tela.repaint();
    }
}
