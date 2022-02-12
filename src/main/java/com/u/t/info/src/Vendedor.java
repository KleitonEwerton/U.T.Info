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
public class Vendedor extends Funcionario {
    
    private List<Venda> vendas;

    public Vendedor(List<Venda> vendas, String nome, String contato, String cpf, String codigoHash, String rua, String numero, String cidade, String uf, String cep, double salario) {
        super(nome, contato, cpf, codigoHash, rua, numero, cidade, uf, cep, salario);
        this.vendas = vendas;
    }
    
   
    
    public void cadatrarCliente(String nome, String endereco, String cpf, String contato)
    {
        Cliente cliente = new Cliente(nome,endereco,cpf,contato, "", "", "", "", "", "");
        System.out.println(nome + " foi cadastrado(a).");
    }
    
    public void pedidoDevolucao(Produto produto, String causa)
    {
        System.out.println("O produto " + produto.getNome() + " vai ser analisado.");
        System.out.println("Causa da devolução: " + causa);
    }
    
    public void efetuarVenda(Produto produto, Cliente cliente)
    {
        produto.setQtdeEstoque(produto.getQtdeEstoque()-1);
        System.out.println("Venda do " + produto.getNome() + " para " + cliente.getNome());
    }

    @Override
    public double calculaPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
