/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.view;

import com.u.t.info.controller.HabilitarCompra;
import com.u.t.info.controller.HabilitarDevolucoes;
import com.u.t.info.controller.HabilitarEstoque;
import com.u.t.info.controller.RealizarDevolucao;
import com.u.t.info.tables.TableProdutos;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agata
 */
public class TelaSupervisor extends JFrame {

    private JPanel painelPrincipal;

    private JPanel estoque = new JPanel();
    private JPanel compras = new JPanel();
    private JPanel devolucoes = new JPanel();

    private JPanel botoes;

    private JLabel txt_Inf = new JLabel();
    
    private JLabel quantidadeDevolucao;
    private JTextField jtQuantidadeDevolucao;
    private JLabel codigo;
    private JTextField jtCodigo;
    private JLabel defeito;
    private JRadioButton sim;
    private JRadioButton nao;
    private ButtonGroup rbDefeito;
    
    private int lastIndex;
    
    private JScrollPane barraRolagem;
    private CardLayout cardLayout;
    private JPanel painel;

    private TableProdutos modelProduto;
    private JTable tableProduto;

    public TelaSupervisor() {

        //não entendi como usar ainda
        super("Supervisonamento");
        this.calendario();
    }

    public void calendario() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();
                        int dia = cal.get(Calendar.DAY_OF_MONTH);
                        int mes = cal.get(Calendar.MONTH);
                        int ano = cal.get(Calendar.YEAR);

                        int segundos = cal.get(Calendar.SECOND);
                        int minutos = cal.get(Calendar.MINUTE);
                        int horas = cal.get(Calendar.HOUR_OF_DAY);

                        txt_Inf.setText("Supervisionamento" + " " + (horas - 1) + ":" + minutos + ":" + segundos + "    " + dia + "/" + (mes + 1) + "/" + ano);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        clock.start();
    }

    public void desenha() {
        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());
        this.painelPrincipal.setPreferredSize(new Dimension(800, 600));

        desenhaPainelEstoque();
        desenhaPainelCompras();
        desenhaPainelDevolucoes();

        desenhaCard();

        desenhaMenus();
        this.add(this.painelPrincipal);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.repaint();
    }

    public void desenhaCard() {
        cardLayout = new CardLayout();
        painel = new JPanel();
        painel.setLayout(cardLayout);
        //painel.setPreferredSize(new Dimension(500,500));

        painel.add(this.estoque, "1");
        painel.add(this.compras, "2");
        painel.add(this.devolucoes, "3");
        cardLayout.show(painel, "1");

        this.painelPrincipal.add(painel, BorderLayout.CENTER);
    }

    public void desenhaMenus() {
        botoes = new JPanel();
        botoes.setBorder(BorderFactory.createTitledBorder("Menu"));
        botoes.setLayout(new GridBagLayout());

        JButton btnEstoque = new JButton("Estoque");
        btnEstoque.addActionListener(new HabilitarEstoque(this));
        btnEstoque.setBackground(Color.red);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = new Insets(10, 0, 0, 0);
        gbc.gridheight = 1;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        botoes.add(btnEstoque, gbc);

        JButton btnCompras = new JButton("Compras");
        btnCompras.addActionListener(new HabilitarCompra(this));
        btnCompras.setBackground(Color.red);
        gbc.gridx = 0;
        gbc.gridy = 1;
        botoes.add(btnCompras, gbc);

        JButton btnDevolucao = new JButton("Devolução");
        btnDevolucao.addActionListener(new HabilitarDevolucoes(this));
        btnDevolucao.setBackground(Color.red);
        gbc.gridx = 0;
        gbc.gridy = 2;
        botoes.add(btnDevolucao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 1.0;
        botoes.add(new JLabel(""), gbc);
        this.painelPrincipal.add(botoes, BorderLayout.WEST);
    }

    public void desenhaPainelEstoque() {

        estoque.setBorder(BorderFactory.createTitledBorder("Estoque"));

        this.setLayout(new BorderLayout());
        //estoque.setPreferredSize(new Dimension(500, 500));

        this.estoque.setPreferredSize(new Dimension(500, 500));

        this.modelProduto = new TableProdutos();

        this.tableProduto = new JTable(modelProduto);
        this.tableProduto.setVisible(true);

        //this.tabelaProdutos.setPreferredScrollableViewportSize(new Dimension(800, 400));
        barraRolagem = new JScrollPane(tableProduto);
        this.estoque.add(barraRolagem, BorderLayout.CENTER);

        //oq fazer????
        JButton notificarGerente = new JButton("Notificar gerente");
        estoque.add(notificarGerente);

    }

    //não sei oq terá nesses dois paineis ainda
    public void desenhaPainelCompras() {

        compras.setBorder(BorderFactory.createTitledBorder("Compras"));

        this.setLayout(new BorderLayout());
        //estoque.setPreferredSize(new Dimension(500, 500));

        JLabel quantidadeDeCompra = new JLabel("Quantidade para compra: ");
        JLabel quantidadeEmestoque = new JLabel("Quantidade em estoque");

        compras.add(quantidadeDeCompra);
        compras.add(quantidadeEmestoque);

        //this.painelPrincipal.add(compras, BorderLayout.EAST);
    }

    public void desenhaPainelDevolucoes() {

        this.devolucoes.setBorder(BorderFactory.createTitledBorder("Devoluções"));

        this.setLayout(new BorderLayout());
        //estoque.setPreferredSize(new Dimension(500, 500));
        
        

        this.quantidadeDevolucao = new JLabel("Quantidade para devolução:");
        this.jtQuantidadeDevolucao = new JTextField(10);
        this.codigo = new JLabel("Código do produto: ");
        this.jtCodigo = new JTextField(20);
        this.defeito = new JLabel("Produto se encontra com defeito efeito? ");
        this.sim = new JRadioButton("Sim");
        this.nao = new JRadioButton("Não");
        this.rbDefeito = new ButtonGroup();
        this.rbDefeito.add(sim);
        this.rbDefeito.add(nao);
     
        JButton btnDevolucao = new JButton("Devolução");
        btnDevolucao.addActionListener(new RealizarDevolucao(this));
        this.devolucoes.add(this.quantidadeDevolucao);
       
        this.devolucoes.add(this.jtQuantidadeDevolucao);
        
        this.devolucoes.add(this.codigo);
        
        this.devolucoes.add(this.jtCodigo);
       
        this.devolucoes.add(this.defeito);
       
        this.devolucoes.add(this.sim);
        
        this.devolucoes.add(this.nao);
        
        this.devolucoes.add(btnDevolucao);

        //this.painelPrincipal.add(devolucoes, BorderLayout.EAST);
        //this.getEstoque().isOptimizedDrawingEnabled();
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

    public JPanel getPainelPrincipal() {
        return painelPrincipal;
    }

    public void setPainelPrincipal(JPanel painelPrincipal) {
        this.painelPrincipal = painelPrincipal;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getPainel() {
        return painel;
    }

    public void setPainel(JPanel painel) {
        this.painel = painel;
    }

    public JTextField getJtQuantidadeDevolucao() {
        return jtQuantidadeDevolucao;
    }

    public void setJtQuantidadeDevolucao(JTextField jtQuantidadeDevolucao) {
        this.jtQuantidadeDevolucao = jtQuantidadeDevolucao;
    }

    public JRadioButton getSim() {
        return sim;
    }

    public void setSim(JRadioButton sim) {
        this.sim = sim;
    }

    public JRadioButton getNao() {
        return nao;
    }

    public void setNao(JRadioButton nao) {
        this.nao = nao;
    }

    public JTable getTableProduto() {
        return tableProduto;
    }

    public void setTableProduto(JTable tableProduto) {
        this.tableProduto = tableProduto;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }
    
    
}
