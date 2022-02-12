/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.view.TelaVendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author luiz
 */
public class DesenharPainelDevolucoes implements ActionListener{
    private TelaVendedor tela;

    public DesenharPainelDevolucoes(TelaVendedor tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        tela.getCardLayout().show(tela.getPainelCards(),"3");
    }
    
    
}
