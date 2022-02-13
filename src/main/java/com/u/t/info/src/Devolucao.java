/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

/**
 *
 * @author luiz
 */
public class Devolucao {
    private String nomeVendedor;
    private Produto produto;
    private int quantidade;
    private String Quebrado;

    public Devolucao(String nomeVendedor, Produto produto, int quantidade, String Quebrado) {
        this.nomeVendedor = nomeVendedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.Quebrado = Quebrado;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getQuebrado() {
        return Quebrado;
    }

    public void setQuebrado(String Quebrado) {
        this.Quebrado = Quebrado;
    }
    
    
    
}
