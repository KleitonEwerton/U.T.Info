/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Produto;
import com.u.t.info.tables.TableProdutos;
import com.u.t.info.utils.Arquivo;
import com.u.t.info.utils.JSONProduto;
import com.u.t.info.view.TelaSupervisor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agata
 */
public class NotificarGerente implements ActionListener {

    TelaSupervisor tela;
    private static final String CAMINHO = "produtoEmFalta.json";

    public NotificarGerente(TelaSupervisor tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedIndex = tela.getTableProduto().getSelectedRow();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(tela, "Selecione um produto!");
        } else {
            TableProdutos modelo =  tela.getModelProduto();
            try {
                Produto produtos = new Produto(modelo.getValueAt(selectedIndex, 0).toString(), modelo.getValueAt(selectedIndex, 1).toString(), Double.parseDouble(modelo.getValueAt(selectedIndex, 2).toString()), Double.parseDouble(modelo.getValueAt(selectedIndex, 3).toString()), modelo.getValueAt(selectedIndex, 4).toString(), modelo.getValueAt(selectedIndex, 5).toString(), modelo.getValueAt(selectedIndex, 6).toString(), Integer.parseInt(modelo.getValueAt(selectedIndex, 7).toString()), Integer.parseInt(modelo.getValueAt(selectedIndex, 8).toString()));
                String toJSON = JSONProduto.toJSON(produtos);
                System.out.println(toJSON);
                Arquivo.escreverArquivo(CAMINHO, toJSON);
            } catch (IOException ex) {
                JOptionPane.showConfirmDialog(tela, "Não foi possível salvar os dados!");
            }
        }
    }
}
