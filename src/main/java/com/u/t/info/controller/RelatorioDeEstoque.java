/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.controller;


import com.u.t.info.src.Produto;
import com.u.t.info.utils.Arquivo;
import com.u.t.info.utils.JSONProduto;
import com.u.t.info.view.TelaGerente;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author agata
 */

/*
Classe usada pela tela de gerente para mostrar a notificação do produto em falta no estoque, mandada pelo supervisor
*/
public class RelatorioDeEstoque implements WindowListener {

    
    //atributo
    private TelaGerente tela;
    
    //caminho para acesso ao arquivo
    private static final String CAMINHO = "arquivos/produtoEmFalta.json";

    
    /*
    Contrutor de clase
    param: TelaGerente tela;
    */
    public RelatorioDeEstoque(TelaGerente tela) {
        this.tela = tela;
    }

    
    /*

        ação realizada ao abrir tela
    param: WindowEvent
*/
    @Override
    public void windowOpened(WindowEvent e) {
        try {
            //ler os dados do arquivo
            String dados = Arquivo.lerArquivo(CAMINHO);
            if (!dados.isEmpty()) {
 
                //tranforma em produto a string recebida pelo arquivo
                Produto produto = JSONProduto.toProduto(dados);
                
                //exibe a mensagem com agumas informações do produto em falta
                JOptionPane.showMessageDialog(tela, "Produtos para repor estoque:\n" + "Nome: " + produto.getNome() + "  |  Código: " + produto.getCodigo() + "   |   Estoque: " + produto.getQtdeEstoque());
                PrintWriter printWriter = new PrintWriter(CAMINHO);
                printWriter.print("");
                printWriter.close();
            }
        } catch (FileNotFoundException ex) {
            //System.out.println("Catchhhhhhh");
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
