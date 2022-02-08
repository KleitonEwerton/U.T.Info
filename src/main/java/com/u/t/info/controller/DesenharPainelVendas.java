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
public class DesenharPainelVendas implements ActionListener{
    
    private TelaVendedor tela;

    public DesenharPainelVendas(TelaVendedor tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        this.tela.repaint();
        this.tela.desenhaVendas();
        this.tela.repaint();

    }
    
    
}
