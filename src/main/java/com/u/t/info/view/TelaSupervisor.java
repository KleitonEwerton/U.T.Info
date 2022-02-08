/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import com.u.t.info.controller.HabilitarCompra;
import com.u.t.info.controller.HabilitarDevolucoes;
import com.u.t.info.controller.HabilitarEstoque;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agata
 */
public class TelaSupervisor extends JFrame{
    
    private JPanel painelPrincipal;
    
    private JPanel estoque = new JPanel();
    private JPanel compras = new JPanel();
    private JPanel devolucoes= new JPanel();
    
    private JPanel botoes;
    
    private JLabel txt_Inf = new JLabel();
    
     private JTable tabela;
    private JScrollPane barraRolagem;
    
    
    public TelaSupervisor()  {
        
        //não entendi como usar ainda
        super("Supervisonamento");
        this.calendario();
        estoque.setVisible(true);
        compras.setVisible(false);
        devolucoes.setVisible(false);
        
    }
    
   public void calendario(){
        Thread clock = new Thread(){
            public void run(){
                try{
                    for(;;){
                        Calendar cal = new GregorianCalendar();
                        int dia = cal.get(Calendar.DAY_OF_MONTH);
                        int mes = cal.get(Calendar.MONTH);
                        int ano = cal.get(Calendar.YEAR);
                        
                        int segundos = cal.get(Calendar.SECOND);
                        int minutos = cal.get(Calendar.MINUTE);
                        int horas = cal.get(Calendar.HOUR_OF_DAY);
                        
                        txt_Inf.setText("Supervisionamento" + " " + (horas-1) + ":" + minutos + ":" + segundos + "    " + dia+"/" + (mes+1) + "/" + ano);
                        sleep(1000);
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }
    
    public void desenha(){
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        
        
        //não deu certo as funções dos botões
        desenhaMenus();
        desenhaPainelEstoque();
       //desenhaPainelCompras();
       //desenhaPainelDevolucoes();
        
        
        
        this.add(this.painelPrincipal);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.repaint();
    }
    
    public void desenhaMenus(){
       
        
        botoes = new JPanel();
        botoes.setBorder(BorderFactory.createTitledBorder("Adiconar Produto"));
        botoes.setLayout(new GridLayout(0, 1));
        
         JButton btnEstoque = new JButton("Estoque");
         btnEstoque.addActionListener(new HabilitarEstoque(this));
        btnEstoque.setBackground(Color.red);
        botoes.add(btnEstoque);
        
        JButton btnCompras = new JButton("Compras");
        btnCompras.addActionListener(new HabilitarCompra(this));
        btnCompras.setBackground(Color.red);
        botoes.add(btnCompras);
        
        JButton btnDevolucao = new JButton("Devolução");
        btnDevolucao.addActionListener(new HabilitarDevolucoes(this));
        btnDevolucao.setBackground(Color.red);
        botoes.add(btnDevolucao);
        
        this.painelPrincipal.add(botoes, BorderLayout.CENTER);
    }
    
    public void desenhaPainelEstoque(){
        
        estoque.setBorder(BorderFactory.createTitledBorder("Estoque"));
        
        this.setLayout(new BorderLayout());
        estoque.setPreferredSize(new Dimension(500, 500));
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        //TODO: pegar objeto de produto ainda nn sei como fazer
        Object[] dados
                = {"Notebook", 12, 3};
        
        //adciona titulo das colunas
        modelo.addColumn("Produto");
        modelo.addColumn("Estoque inicial");
        modelo.addColumn("Estoque Restante");

        
        //adiciona os dados manuais para teste
        modelo.addRow(dados);
        
        tabela = new JTable(modelo);

        barraRolagem = new JScrollPane(tabela);
        estoque.add(barraRolagem, BorderLayout.CENTER);
        
        //oq fazer????
        JButton notificarGerente = new JButton("Notificar gerente");
        estoque.add(notificarGerente);

        this.painelPrincipal.add(estoque, BorderLayout.EAST);
    }
    
    
    //não sei oq terá nesses dois paineis ainda
     public void desenhaPainelCompras(){
        
        compras.setBorder(BorderFactory.createTitledBorder("Compras"));
        
        this.setLayout(new BorderLayout());
        estoque.setPreferredSize(new Dimension(500, 500));
        
        JLabel quantidadeDeCompra = new JLabel("Quantidade para compra");
        JLabel quantidadeEmestoque = new JLabel("Quantidade em estoque");
        
        compras.add(quantidadeDeCompra);
        compras.add(quantidadeEmestoque);
        
        
        

        this.painelPrincipal.add(compras, BorderLayout.EAST);
    }
     
        public void desenhaPainelDevolucoes(){
        
        devolucoes.setBorder(BorderFactory.createTitledBorder("Compras"));
        
        this.setLayout(new BorderLayout());
        estoque.setPreferredSize(new Dimension(500, 500));
        
        JLabel quantidadeDevolucao = new JLabel("Quantidade para devolver");
        JLabel defeito = new JLabel("Defeito");
        
        compras.add(quantidadeDevolucao);
        compras.add(defeito);
        
        
        

        this.painelPrincipal.add(devolucoes, BorderLayout.EAST);
    }
   
    
    public static void main(String[] args) {
        TelaSupervisor tela = new TelaSupervisor();

        tela.desenha();
        tela.pack();
    }

    public JPanel getEstoque() {
        return estoque;
    }

    public void setEstoque(JPanel estoque) {
        this.estoque = estoque;
    }

    public JPanel getCompras() {
        return compras;
    }

    public void setCompras(JPanel compras) {
        this.compras = compras;
    }

    public JPanel getDevolucoes() {
        return devolucoes;
    }

    public void setDevolucoes(JPanel devolucoes) {
        this.devolucoes = devolucoes;
    }
    
     
    
}
