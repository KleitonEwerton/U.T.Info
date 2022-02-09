/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KleitonEwerton
 */

public class Gerente extends Funcionario{
    
    static public List<Produto> bdProdutos = new ArrayList<>();         //Simula Banco de dados, por enquanto
    static public List<Fornecedor> bdFornecedores = new ArrayList<>();  //Simula Banco de dados, por enquanto
    static public List<Supervisor> bdSupervisores = new ArrayList<>();  //Simula Banco de dados, por enquanto
    static public List<Vendedor> bdVendedores = new ArrayList<>();      //Simula Banco de dados, por enquanto
    
    
    public Gerente(String nome, String contato, String cpf, String codigoHash, Integer identificacao, String rua, String numero, String cidade, String uf, String cep, double salario){
        
        super(nome, contato, cpf, codigoHash, identificacao, rua, numero, cidade, uf, cep, salario);
        
    }
   
    public void emitirRelatorio(){
        
        //Escrita do relátorio em um arquivo da saída
    
    }
    
}
