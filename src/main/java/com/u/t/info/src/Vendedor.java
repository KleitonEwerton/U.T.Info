/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

/**
 *
 * @author luiz
 */
public class Vendedor extends Funcionario {
    
    public Vendedor(String nome, String contato, String cpf, String codigoHash, Integer identificacao,String endereço)
    {
        super(nome,contato,cpf,codigoHash,identificacao,endereço);
    }
    
    public void cadatrarCliente(String nome, String endereco, String cpf, String contato)
    {
        Cliente cliente = new Cliente(nome,endereco,cpf,contato);
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
}
