/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import com.u.t.info.src.Produto;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
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
    
    private JList<Produto> listaProdutos;

    private JPanel cadastro;
    private JPanel venda;
    private JPanel inf;

    private JLabel name;
    private JLabel code;
    private JLabel model;
    private JLabel fornecedor;
    private JLabel estoque;
    private JLabel estoqueMin;
    private JLabel precoVenda;
    private JLabel precoCompra;
    private JLabel codeVenda;
    private JLabel descricaoLabel;

    private JTextField nome;
    private JTextField codigo;
    private JTextField modelo;
    private JTextField estoqueInicial;
    private JTextField estoqueMinimo;
    private JTextField custoVenda;
    private JTextField custoCompra;
    private JTextField codigoVenda;
    
    private JTextArea descricao;

    private JComboBox fornecedores;

    private JButton cancelar;
    private JButton salvar;
    private JButton cancelarVenda;
    private JButton salvarVenda;
     private JButton cancelarInf;
    private JButton salvarInf;

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

        desenhaCadastro();
        desenhaVenda();
        desenhaAdiconais();
        

        this.getContentPane().add(barraDeMenu);
        this.setSize(800, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void desenhaCadastro(){
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

        this.estoqueMin = new JLabel("Estoque Minimo:");
        this.estoqueMinimo = new JTextField(25);
        
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
        
         this.cadastro.add(this.estoqueMin);
        this.cadastro.add(this.estoqueMinimo);

        this.cadastro.add(this.code);
        this.cadastro.add(this.codigo);

        this.cadastro.add(this.cancelar);
        this.cadastro.add(this.salvar);
    }
    public void desenhaVenda(){
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
    }
    
    public void desenhaAdiconais(){
        this.descricaoLabel = new JLabel("Descrição do produto: ");
        this.descricao = new JTextArea(5, 65);
        
        this.cancelarInf = new JButton("Cancelar");
        this.salvarInf = new JButton("Salvar");
        
        this.inf.add(this.descricaoLabel);
        this.inf.add(this.descricao);
        this.inf.add(this.cancelarInf);
        this.inf.add(this.salvarInf);
        
        DefaultListModel<Produto> model = new DefaultListModel<>();
        model.addElement(new Produto("Notebook", "123", 4000.00,4500.00, "Dell", "8GB CORE I5", "iNSPIRATION",1000, 50));
        
        
        listaProdutos = new JList<>(model);
    }

    public static void main(String[] args) {
        TelaProduto tela = new TelaProduto();

        tela.desenha();
        //tela.pack();
    }

    public JList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public JTextField getNome() {
        return nome;
    }

    public JTextField getModelo() {
        return modelo;
    }

    public JTextField getEstoqueInicial() {
        return estoqueInicial;
    }

    public JTextField getCustoVenda() {
        return custoVenda;
    }

    public JTextField getCustoCompra() {
        return custoCompra;
    }

    public JTextField getCodigoVenda() {
        return codigoVenda;
    }

    public JTextArea getDescricao() {
        return descricao;
    }

    public JComboBox getFornecedores() {
        return fornecedores;
    }

    public void setListaProdutos(JList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void setCodigo(JTextField codigo) {
        this.codigo = codigo;
    }

    public void setModelo(JTextField modelo) {
        this.modelo = modelo;
    }

    public void setEstoqueInicial(JTextField estoqueInicial) {
        this.estoqueInicial = estoqueInicial;
    }

    public void setCustoVenda(JTextField custoVenda) {
        this.custoVenda = custoVenda;
    }

    public void setCustoCompra(JTextField custoCompra) {
        this.custoCompra = custoCompra;
    }

    public void setCodigoVenda(JTextField codigoVenda) {
        this.codigoVenda = codigoVenda;
    }

    public void setDescricao(JTextArea descricao) {
        this.descricao = descricao;
    }

    public void setFornecedores(JComboBox fornecedores) {
        this.fornecedores = fornecedores;
    }

    public JTextField getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(JTextField estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public JTextField getCodigo() {
        return codigo;
    }
    
    

}
