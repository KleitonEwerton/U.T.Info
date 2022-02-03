/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author KleitonEwerton
 */
public class TelaSupervisor extends JFrame{
    
    public TelaSupervisor(){
        super("Supervisor");
    }
    
    public void draw(){
        
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        
        //TODO: verificar o layout antes
        //TODO: Botões Laterais
        //TODO: Criar uma tabela
        
        this.setVisible(true);
        
    }
    
}
