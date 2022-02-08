/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Produto;
import com.u.t.info.view.TelaCadastroProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author agata
 */
public class SalvaProduto implements ActionListener {

    private TelaCadastroProduto telaCadastroProduto;

    public SalvaProduto(TelaCadastroProduto telaCadastroProduto) {
        this.telaCadastroProduto = telaCadastroProduto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Produto> model = (DefaultListModel<Produto>) telaCadastroProduto.getListaProdutos().getModel();

        //como faz com o tipo???
        model.addElement(new Produto(telaCadastroProduto.getNome().getText(),
                telaCadastroProduto.getCodigo().getText(),
                Double.parseDouble(telaCadastroProduto.getCustoCompra().getText()),
                Double.parseDouble(telaCadastroProduto.getCustoVenda().getText()),
                //como pegar o texto de uma combobox???
                "Fornecedor x",
                telaCadastroProduto.getDescricao().getText(),
                telaCadastroProduto.getModelo().getText(),
                Integer.parseInt(telaCadastroProduto.getEstoqueInicial().getText()),
                Integer.parseInt(telaCadastroProduto.getEstoqueMinimo().getText())
        ));
    }
}
