/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.view.TelaCadastroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

/**
 *
 * @author luiz
 */
public class AbrirTelaCadastroCliente implements ActionListener{
    private TelaCadastroCliente tela;

    public AbrirTelaCadastroCliente() {
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        tela = new TelaCadastroCliente();
        tela.desenha();
    }
    
    
    
    
}
