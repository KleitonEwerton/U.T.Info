/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.tables;

import com.u.t.info.view.TelaGerente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author KleitonEwerton
 */

public class RemoverFuncionario implements ActionListener{

    private final TelaGerente tela;

    public RemoverFuncionario(TelaGerente tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int indexLinha = this.tela.getTableFuncionario().getSelectedRow();
        
        try{
            
            this.tela.getModelFuncionario().removerFuncionario(indexLinha);
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "NENHUMA LINHA SELECIONADA, IMPOSSÍVEL REMOVER", "ERRO",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}

