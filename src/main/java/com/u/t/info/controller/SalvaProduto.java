/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Produto;
import com.u.t.info.view.TelaProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author agata
 */
public class SalvaProduto implements ActionListener {

    private TelaProduto telaProduto;

    public SalvaProduto(TelaProduto telaProduto) {
        this.telaProduto = telaProduto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<Produto> model = (DefaultListModel<Produto>) telaProduto.getListaProdutos().getModel();

        //como faz com o tipo???
        model.addElement(new Produto(telaProduto.getNome().getText(),
                telaProduto.getCodigo().getText(),
                Double.parseDouble(telaProduto.getCustoCompra().getText()),
                Double.parseDouble(telaProduto.getCustoVenda().getText()),
                //como pegar o texto de uma combobox???
                "Fornecedor x",
                telaProduto.getDescricao().getText(),
                telaProduto.getModelo().getText(),
                Integer.parseInt(telaProduto.getEstoqueInicial().getText()),
                Integer.parseInt(telaProduto.getEstoqueMinimo().getText())
        ));
    }

}
