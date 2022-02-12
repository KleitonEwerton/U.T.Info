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
    private Cliente cliente;
    private Produto produto;
    private double valor;

    public Venda(Vendedor vendedor,Cliente cliente, Produto produtos, double valor) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.produto = produtos;
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
    public Produto getProduto() {
        return produto;
    }

    @Override
    public void setProdutos(Produto produto) {
        this.produto = produto;
    }
    @Override
    public double getValor() {
        return valor;
    }
    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
