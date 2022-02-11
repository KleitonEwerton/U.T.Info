
package com.u.t.info.view;

import com.u.t.info.controller.RelatorioDeEstoque;
import com.u.t.info.src.Gerente;
import com.u.t.info.tables.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class TelaGerente extends JFrame{
    
    private JTabbedPane menuBar;

    private JPanel funcionarios;
    private JPanel produtos;
    private JPanel fornecedores;
    private JPanel auxPanelFuncionario;
    private JPanel auxPanelProduto;
    private JPanel auxPanelFornecedor;

    private JTable tableFuncionario;
    private JTable tableFornecedor;
    private JTable tableProduto;
    
    private TableProdutos modelProduto;
    private TableFuncionarios modelFuncionario;
    public static TableFornecedores modelFornecedor;
    
    private JButton btnCadastraFuncionario;
    private JButton btnDemitirFuncionario;
    private JButton btnCadastraProduto;
    private JButton btnRemoverProduto;
    private JButton btnCadastraFornecedor;
    private JButton btnRemoverFornecedor;
    private JButton btnCadastrarProdutos;
    
    public TelaGerente(Gerente gerente) {
        super("Aplicações de Gerenciamento - " + gerente.getNome());
        this.addWindowListener(new RelatorioDeEstoque(this));
    }

    public void draw(){

        
        //CONFIGURAÇÕES
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null); 
        
        //TOOL BAR
        this.menuBar = new JTabbedPane();
        this.funcionarios = new JPanel();
        this.produtos = new JPanel();
        this.fornecedores = new JPanel();

        this.menuBar.addTab("Funcionários", this.funcionarios);
        this.menuBar.addTab("Produtos", this.produtos);
        this.menuBar.addTab("Fornecedores", this.fornecedores);

        this.getContentPane().add(menuBar);
        
        //MENU BAR
        drawFuncionarios();
        this.funcionarios.add(auxPanelFuncionario);

        drawProdutos();
        this.produtos.add(auxPanelProduto);
        
        drawFornecedores();
        this.fornecedores.add(auxPanelFornecedor);
        
        //OUTROS
        this.setVisible(true);
        
       
    }  
    
    private void drawFuncionarios(){
        
        //FUNCIONARIOS
        //BOTÕES PARTE INFERIOR
        
        this.btnCadastraFuncionario = new JButton("Cadastrar Novo Funcionário");
        this.btnDemitirFuncionario = new JButton("Demitir Funcionário");

        
        
        this.modelFuncionario = new TableFuncionarios();
        
        this.tableFuncionario = new JTable(modelFuncionario);
        
        this.tableFuncionario.setVisible(true);
        
        this.tableFuncionario.setPreferredScrollableViewportSize(new Dimension(780,400));
        
        this.funcionarios.add(new JScrollPane(this.tableFuncionario));
        
        this.auxPanelFuncionario = new JPanel();
        
        this.btnCadastraFuncionario.setPreferredSize(new Dimension(385,30));
        this.btnDemitirFuncionario.setPreferredSize(new Dimension(385,30));
        
        this.btnDemitirFuncionario.addActionListener(new RemoverFuncionario(this));
        this.btnCadastraFuncionario.addActionListener(new AbrirTelaCadastroFuncionario());
        
        auxPanelFuncionario.add(this.btnCadastraFuncionario);
        auxPanelFuncionario.add(this.btnDemitirFuncionario);
        
    }
    private void drawProdutos(){
        //PRODUTOS
        //BOTÕES PARTE INFERIOR
        
        this.btnCadastraProduto = new JButton("Cadastrar Novo Produto");
        this.btnRemoverProduto= new JButton("Remover Produto");

        this.modelProduto = new TableProdutos();
        
        this.tableProduto = new JTable(modelProduto);
        
        this.tableProduto.setVisible(true);
        
        this.tableProduto.setPreferredScrollableViewportSize(new Dimension(780,400));
        
        this.produtos.add(new JScrollPane(this.tableProduto));
        
        this.auxPanelProduto = new JPanel();
        
        this.btnCadastraProduto.setPreferredSize(new Dimension(385,30));
        this.btnRemoverProduto.setPreferredSize(new Dimension(385,30));
        
        this.btnRemoverProduto.addActionListener(new RemoveProduto(this));
        this.btnCadastraProduto.addActionListener(new AbrirTelaCadastroProduto());
        
        auxPanelProduto.add(this.btnCadastraProduto);
        auxPanelProduto.add(this.btnRemoverProduto);
        
    }
    private void drawFornecedores(){
        //FORNECEDORES
        //BOTÕES PARTE INFERIOR
        
        this.btnCadastraFornecedor = new JButton("Cadastrar Novo Fornecedor");
        this.btnRemoverFornecedor  = new JButton("Remover Fornecedor");
        this.btnCadastrarProdutos = new JButton("Cadastrar produtos do fornecedor"); 
        
        TelaGerente.modelFornecedor = new TableFornecedores();
        
        this.tableFornecedor = new JTable(modelFornecedor);
        
        this.tableFornecedor.setVisible(true);
        
        this.tableFornecedor.setPreferredScrollableViewportSize(new Dimension(780,400));
        
        this.fornecedores.add(new JScrollPane(this.tableFornecedor));
        
        this.auxPanelFornecedor = new JPanel();
        
        this.btnCadastraFornecedor.setPreferredSize(new Dimension(266,30));
        this.btnRemoverFornecedor.setPreferredSize(new Dimension(266,30));
        this.btnCadastrarProdutos.setPreferredSize(new Dimension(266,30));
        
        this.btnRemoverFornecedor.addActionListener(new RemoverFornecedor(this));
        this.btnCadastraFornecedor.addActionListener(new AbrirTelaCadastroFornecedor());
        
        this.auxPanelFornecedor.add(this.btnCadastraFornecedor);
        this.auxPanelFornecedor.add(this.btnRemoverFornecedor);
        this.auxPanelFornecedor.add(this.btnCadastrarProdutos);
    }

    public JTable getTableFuncionario() {
        return tableFuncionario;
    }

    public JTable getTableProduto() {
        return tableProduto;
    }

    public JTable getTableFornecedor() {
        return tableFornecedor;
    }

    public TableFuncionarios getModelFuncionario() {
        return modelFuncionario;
    }

    public TableProdutos getModelProduto() {
        return modelProduto;
    }

    public TableFornecedores getModelFornecedor() {
        return modelFornecedor;
    }
 
}

class AbrirTelaCadastroProduto implements ActionListener{
    
    public AbrirTelaCadastroProduto(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        TelaCadastroProduto tela = new TelaCadastroProduto();
        tela.desenha();
        tela.pack();
        
    }
    
    
}

class AbrirTelaCadastroFuncionario implements ActionListener{
    
    public AbrirTelaCadastroFuncionario(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        TelaCadastroFuncionario tela = new TelaCadastroFuncionario();
        tela.desenha();
        tela.pack();
        
    }
    
    
}

class AbrirTelaCadastroFornecedor implements ActionListener{
    
    public AbrirTelaCadastroFornecedor(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        TelaCadastroFornecedor tela = new TelaCadastroFornecedor();
        tela.desenha();
        tela.pack();
    }
    
    
}

class RemoveProduto implements ActionListener{

    private final TelaGerente tela;

    public RemoveProduto(TelaGerente tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int indexLinha = this.tela.getTableProduto().getSelectedRow();
        
        try{
            
            this.tela.getModelProduto().removerProduto(indexLinha);
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "NENHUMA LINHA SELECIONADA, IMPOSSÍVEL REMOVER", "ERRO",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
class RemoverFornecedor implements ActionListener{

    private final TelaGerente tela;

    public RemoverFornecedor(TelaGerente tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int indexLinha = this.tela.getTableFornecedor().getSelectedRow();
        
        try{
            
            this.tela.getModelFornecedor().removerFornecedor(indexLinha);
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "NENHUMA LINHA SELECIONADA, IMPOSSÍVEL REMOVER", "ERRO",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
class RemoverFuncionario implements ActionListener{

    private final TelaGerente tela;

    public RemoverFuncionario(TelaGerente tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        int indexLinha = this.tela.getTableFuncionario().getSelectedRow();
        
        try{
            
            this.tela.getModelFuncionario().removerFuncionario(indexLinha);
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "NENHUMA LINHA SELECIONADA, IMPOSSÍVEL REMOVER", "ERRO",JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
}
