/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

import java.util.List;

/**
 *
 * @author luiz
 */
public class Venda implements Vendas {
    private Vendedor vendedor;
    private List<Produto> produtos;
    private double valor;

    public Venda(Vendedor vendedor, List<Produto> produtos, double valor) {
        this.vendedor = vendedor;
        this.produtos = produtos;
        this.valor = valor;
    }

    @Override
    public Vendedor getVendedor() {
        return vendedor;
    }

    @Override
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    @Override
    public double getValor() {
        return valor;
    }
    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
}
