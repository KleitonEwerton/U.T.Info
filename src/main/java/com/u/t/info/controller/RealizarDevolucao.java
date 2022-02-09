/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Produto;
import com.u.t.info.view.TelaSupervisor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agata
 */
public class RealizarDevolucao implements ActionListener{
     private final TelaSupervisor tela;

    public RealizarDevolucao(TelaSupervisor tela) {
        this.tela = tela;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
         DefaultTableModel modelo = (DefaultTableModel) tela.getTableProduto().getModel();
        //Produto produto = modelo.get(tela.getLastIndex());
        
        
      
//        tela.getListaContatos().setModel(modelo);
        
        tela.repaint();
    }
    
}
