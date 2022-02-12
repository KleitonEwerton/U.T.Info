/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Produto;
import com.u.t.info.view.TelaCadastroProduto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author agata
 */
public class AdicionarProduto implements ActionListener {

    //atributo do tipo TelaCadastroProduto
    private final TelaCadastroProduto tela;

    
    /*
    Contrutor de classe
    param: TelaCadastroProduto
    */
    public AdicionarProduto(TelaCadastroProduto tela) {
        this.tela = tela;
    }

    
    /*
    Realiza ação de adicionar um produto tratando excessões para  os campos
    param: ActionEvent e
    */
    @Override
    public void actionPerformed(ActionEvent e) {

        String strPrecoComp = tela.getCustoCompra().getText();
        String strPrecoVend = tela.getCustoVenda().getText();
        String strEst = tela.getEstoqueInicial().getText();

        try {
            if (tela.getNome().getText().isEmpty() || tela.getCodigo().getText().isEmpty() || tela.getModelo().getText().isEmpty()
            || tela.getEstoqueInicial().getText().isEmpty() || tela.getCustoCompra().getText().isEmpty() || tela.getCustoVenda().getText().isEmpty()
            || tela.getDescricao().getText().isEmpty()) {
                throw new Exception();
            }
            try {
                double precoComp = Double.parseDouble(strPrecoComp);
                try {
                    double precoVend = Double.parseDouble(strPrecoVend);
                    try {
                        int estInicial = Integer.parseInt(strEst);
                        Produto produto = new Produto(tela.getNome().getText(), tela.getCodigo().getText(),
                                precoComp, precoVend, tela.getFornecedores().getSelectedItem().toString(), tela.getDescricao().getText(),
                                tela.getModelo().getText(), estInicial, 2);

                        tela.getListaProdutos().add(produto);
                        JOptionPane.showMessageDialog(tela, "Produto adicionado");
                        LimparFormularioProduto limpar = new LimparFormularioProduto(tela);
                        limpar.LimparFormulario();
                    } catch (NumberFormatException exception) {
                        JOptionPane.showConfirmDialog(null, "Verificar o estoque inicial! \nProibido uso de letras!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
                    }
                } catch (NumberFormatException exception) {
                    JOptionPane.showConfirmDialog(null, "Verificar o preço da venda! \nProibido uso de letras!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showConfirmDialog(null, "Verificar o preço da compra! \nProibido uso de letras!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
            }
        }
        catch(Exception exception) {
            JOptionPane.showConfirmDialog(null, "Verificar os campos! \nProibido prosseguir sem digitar!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
        }
    }
}