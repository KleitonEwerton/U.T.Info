/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author agata
 */
public class TelaProduto extends JFrame{
    
    
    JFrame produto;
    
    private JTabbedPane barraDeMenu;
    
    private JPanel cadastro;
    private JPanel venda;
    private JPanel inf;
    
    private JLabel name;
    private JLabel code;
    private JLabel model;
    private JLabel fornecedor;
    private JLabel estoque;
    
    private JTextField nome;
    private JTextField codigo;
    private JTextField modelo;
    private JTextField estoqueInicial;
    
    private JComboBox fornecedores;
    
    private JButton cancelar;
    private JButton salvar;
    
    public TelaProduto() {
        super("Produto");
    }
    
    public void desenha(){
        
        this.produto = new JFrame("Produtos");
        
        this.barraDeMenu = new JTabbedPane();
        this.cadastro = new JPanel();
        this.venda = new JPanel();
        this.inf = new JPanel();
    
        this.barraDeMenu.addTab("Cadastro", this.cadastro);
        this.barraDeMenu.addTab("Custo / Preço de Venda", this.venda);
        this.barraDeMenu.addTab("Informações Adicionais", this.inf);
        
        this.name = new JLabel("Nome:");
        this.nome = new JTextField(65);
        
        this.code = new JLabel("Código:");
        this.model = new JLabel("Modelo:");
        this.fornecedor = new JLabel("Fornecedor:");
        this.estoque = new JLabel("Estoque Inicial:");
        
        this.cadastro.add(this.name);
        this.cadastro.add(this.nome);
        
        this.cadastro.add(this.code);
        this.cadastro.add(this.model);
        this.cadastro.add(this.fornecedor);
        this.cadastro.add(this.estoque);
        
        this.produto.getContentPane().add(barraDeMenu);
        this.produto.setSize(800, 600);
        this.produto.setVisible(true);
        this.produto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    
   
    

    
    
    public static void main(String[] args) {
        TelaProduto tela = new TelaProduto();
        
        tela.desenha();
        //tela.pack();
    }
    
}
