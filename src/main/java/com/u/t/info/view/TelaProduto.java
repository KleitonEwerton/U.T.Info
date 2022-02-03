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
public class TelaProduto extends JFrame {

    // JFrame produto;
    //para teste, versao final pegar do banco
    private String[] listafornecedores = {"Dell", "Samsung", "Positivo", "Asus", "Acer"};

    private JTabbedPane barraDeMenu;

    private JPanel cadastro;
    private JPanel venda;
    private JPanel inf;

    private JLabel name;
    private JLabel code;
    private JLabel model;
    private JLabel fornecedor;
    private JLabel estoque;
    private JLabel precoVenda;
    private JLabel precoCompra;
    private JLabel codeVenda;

    private JTextField nome;
    private JTextField codigo;
    private JTextField modelo;
    private JTextField estoqueInicial;
    private JTextField custoVenda;
    private JTextField custoCompra;
    private JTextField codigoVenda;

    private JComboBox fornecedores;

    private JButton cancelar;
    private JButton salvar;
    private JButton cancelarVenda;
    private JButton salvarVenda;

    public TelaProduto() {
        super("Produto");
    }

    public void desenha() {

        //this.produto = new JFrame("Produtos");
        this.barraDeMenu = new JTabbedPane();
        this.cadastro = new JPanel();
        this.venda = new JPanel();
        this.inf = new JPanel();

        this.barraDeMenu.addTab("Cadastro", this.cadastro);
        this.barraDeMenu.addTab("Custo / Preço de Venda", this.venda);
        this.barraDeMenu.addTab("Informações Adicionais", this.inf);

        this.name = new JLabel("Nome:");
        this.nome = new JTextField(66);

        this.code = new JLabel("Código:");
        this.codigo = new JTextField(27);

        this.model = new JLabel("Modelo:");
        this.modelo = new JTextField(50);

        this.fornecedor = new JLabel("Fornecedor:");
        this.fornecedores = new JComboBox(this.listafornecedores);

        this.estoque = new JLabel("Estoque Inicial:");
        this.estoqueInicial = new JTextField(27);

        this.cancelar = new JButton("Cancelar");
        this.salvar = new JButton("Salvar");

        this.cadastro.add(this.name);
        this.cadastro.add(this.nome);

        this.cadastro.add(this.fornecedor);
        this.cadastro.add(this.fornecedores);

        this.cadastro.add(this.model);
        this.cadastro.add(this.modelo);

        this.cadastro.add(this.estoque);
        this.cadastro.add(this.estoqueInicial);

        this.cadastro.add(this.code);
        this.cadastro.add(this.codigo);

        this.cadastro.add(this.cancelar);
        this.cadastro.add(this.salvar);

        this.precoVenda = new JLabel("Preço de Venda:");
        this.custoVenda = new JTextField(25);

        this.precoCompra = new JLabel("Preço de Compra:");
        this.custoCompra = new JTextField(25);

        this.codeVenda = new JLabel("Código:");
        this.codigoVenda = new JTextField(27);
        
        this.cancelarVenda = new JButton("Cancelar");
        this.salvarVenda = new JButton("Salvar");

        this.venda.add(this.precoCompra);
        this.venda.add(this.custoCompra);
        this.venda.add(this.precoVenda);
        this.venda.add(this.custoVenda);
        this.venda.add(this.codeVenda);
        this.venda.add(this.codigoVenda);
        this.venda.add(this.cancelarVenda);
        this.venda.add(this.salvarVenda);

        this.getContentPane().add(barraDeMenu);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        TelaProduto tela = new TelaProduto();

        tela.desenha();
        //tela.pack();
    }

}
