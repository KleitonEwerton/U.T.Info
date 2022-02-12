/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;

import com.u.t.info.src.Cliente;
import com.u.t.info.src.Produto;
import com.u.t.info.utils.Arquivo;
import com.u.t.info.utils.JSONCliente;
import com.u.t.info.utils.JSONProduto;
import com.u.t.info.view.TelaGerente;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author agata
 */
public class RelatorioDeEstoque implements WindowListener {

    private TelaGerente tela;
    private static final String CAMINHO = "arquivos/produtoEmFalta.json";

    public RelatorioDeEstoque(TelaGerente tela) {
        this.tela = tela;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {
            
            String dados = Arquivo.lerArquivo(CAMINHO);
            if (!dados.isEmpty()) {
                //System.out.println("Dados" + dados);
                Produto produto = JSONProduto.toProduto(dados);
                JOptionPane.showMessageDialog(tela, "Produtos para repor estoque:\n" + "Nome: " + produto.getNome() + "  |  Código: " + produto.getCodigo() + "   |   Estoque: " + produto.getQtdeEstoque());
                PrintWriter printWriter = new PrintWriter(CAMINHO);
                printWriter.print("");
                printWriter.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Catchhhhhhh");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
