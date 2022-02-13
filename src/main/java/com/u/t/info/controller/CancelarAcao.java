/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.view.TelaCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author KleitonEwerton
 */
public class CancelarAcao implements ActionListener{
    
    private final TelaCadastro tela;

    public CancelarAcao(TelaCadastro tela) {
        this.tela = tela;
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        tela.dispose();
       
    }
    
}
