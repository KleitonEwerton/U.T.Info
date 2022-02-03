/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author KleitonEwerton
 */
public class TelaGerente extends JFrame{
    
    private JTabbedPane menuBar;

    private JPanel funcionarios;
    private JPanel produtos;
    private JPanel fornecedores;

    
    private JButton btnCadastraFuncionario;
    private JButton btnDemitirFuncionario;

    
    public TelaGerente() {
        super("Aplicações de Gerenciamento");
    }

    public void draw(){

        
        //CONFIGURAÇÕES
        
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        
        
        //TOOL BAR
        
        this.menuBar = new JTabbedPane();
        this.funcionarios = new JPanel();
        this.produtos = new JPanel();
        this.fornecedores = new JPanel();

        this.menuBar.addTab("Funcionários", this.funcionarios);
        this.menuBar.addTab("Produtos", this.produtos);
        this.menuBar.addTab("Fornecedores", this.fornecedores);

        this.getContentPane().add(menuBar);
        
        
        //BOTÕES PARTE INFERIOR
        
        this.btnCadastraFuncionario = new JButton("Cadastrar Novo Funcionário");
        this.btnDemitirFuncionario = new JButton("Demitir Funcionário");

        this.funcionarios.add(this.btnCadastraFuncionario);
        this.funcionarios.add(this.btnDemitirFuncionario);


        
        //OTHERS
        
        this.setVisible(true);
        
       
    }  
    
    
}
