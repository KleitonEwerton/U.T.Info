/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import com.u.t.info.controller.DesenharPainelClientes;
import com.u.t.info.controller.DesenharPainelVendas;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luiz
 */
public class TelaVendedor extends JFrame{
 
    JPanel painelPrincipal;
    JPanel painelClientes;
    JPanel painelVendas;
    JPanel paineldevolucoes;
    JPanel painelBotoes;
    
    JTable jtClientes;
    JTable jtVendas;
    JTable jtDevolucoes;
    
    DefaultTableModel modelClientes;
    DefaultTableModel modelVendas;
    DefaultTableModel modelDevolucoes;
    
    JButton btnClientes;
    JButton btnVendas;
    JButton btnDevolucoes;
    JButton btnCadastrarCliente;
    JButton btnRealizarVendas;
    
    CardLayout cardLayout;
    
   
    
    
    public TelaVendedor()
    {
        super("Sistema de Vendas");
    }
    
    public void desenha()
    {
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        this.setSize(800,600);
        this.setVisible(true);
        //this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        desenhaBotoes();
        //desenhaClientes();
        
        this.add(this.painelPrincipal, BorderLayout.CENTER);
        this.repaint();
    }

    
    private void desenhaBotoes()
    {
        this.painelBotoes = new JPanel();
        this.painelBotoes.setLayout(new GridLayout(0, 1));
        this.painelBotoes.setPreferredSize(new Dimension(150, 300));
        
        this.btnClientes = new JButton("Clientes");
        this.btnClientes.addActionListener(new DesenharPainelClientes(this));
        this.painelBotoes.add(this.btnClientes);
        
        this.btnVendas = new JButton("Vendas");
        this.btnVendas.addActionListener(new DesenharPainelVendas(this));
        this.painelBotoes.add(this.btnVendas);
        
        this.btnDevolucoes = new JButton("Devoluções");
        this.painelBotoes.add(this.btnDevolucoes);
        
        this.painelPrincipal.add(this.painelBotoes, BorderLayout.WEST);
    }
    
    public void desenhaClientes()
    {
        JScrollPane scroll;
        this.painelClientes = new JPanel();
        this.painelClientes.setBorder(BorderFactory.createTitledBorder("Clientes"));
        this.painelClientes.setLayout(new BorderLayout());
        this.painelClientes.setPreferredSize(new Dimension(600,590));
        
        this.modelClientes = new DefaultTableModel();
        modelClientes.addColumn("Nome");
        modelClientes.addColumn("CPF");
        
        this.btnCadastrarCliente = new JButton("Cadastrar cliente");
        this.btnCadastrarCliente.setPreferredSize(new Dimension(20, 20));
        this.painelClientes.add(this.btnCadastrarCliente, BorderLayout.SOUTH);
        
        this.jtClientes = new JTable(modelClientes);
        scroll = new JScrollPane(jtClientes);
        scroll.setPreferredSize(new Dimension(590, 580));
        this.painelClientes.add(scroll, BorderLayout.CENTER);
        
//        this.btnCadastrarCliente = new JButton("Cadastrar cliente");
//        this.painelClientes.add(this.btnCadastrarCliente, FlowLayout.LEADING);
         
        this.painelPrincipal.add(this.painelClientes, BorderLayout.CENTER);
        
    }
    
    public void desenhaVendas()
    {
        JScrollPane scrollVendas;
        this.painelVendas = new JPanel();
        this.painelVendas.setBorder(BorderFactory.createTitledBorder("Vendas"));
        this.painelVendas.setLayout(new BorderLayout());
        this.painelVendas.setPreferredSize(new Dimension(600,590));
        
        this.btnRealizarVendas = new JButton("Realizar Vendas");
        this.btnRealizarVendas.setPreferredSize(new Dimension(20, 20));
        this.painelVendas.add(this.btnRealizarVendas, BorderLayout.SOUTH);
        
        this.modelVendas = new DefaultTableModel();
        this.modelVendas.addColumn("Comprador");
        this.modelVendas.addColumn("Produto");
        this.modelVendas.addColumn("Valor");
        
        this.jtVendas = new JTable(modelVendas);
        scrollVendas = new JScrollPane(jtVendas);
        scrollVendas.setPreferredSize(new Dimension(590, 580));
        this.painelVendas.add(scrollVendas, BorderLayout.CENTER);
        
        this.painelPrincipal.add(this.painelVendas, BorderLayout.CENTER);
        
    }
    
    public void desenhaDevolucoes()
    {
        
    }

}
