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
    
    
    public Gerente(String nome, String contato, String cpf, String codigoHash, Integer identificacao,String endereço){
        
        super(nome, contato, cpf, codigoHash, identificacao, endereço);
        
    }
   
    public void cadastrarProduto(String nome, String codigo, double precoCompra, double precoVenda, String fornecedor, String descricao, String modelo,int qtdeEstoque, int estoqueMinimo){
        
       Produto produto = new Produto(nome, codigo, precoCompra, precoVenda, fornecedor, descricao, modelo, qtdeEstoque, estoqueMinimo);
       //TODO: Salva esse produto no banco de dados
       bdProdutos.add(produto);
       produto.salvaProduto();
      
    }
    
    public void cadastrarFornecedor(String razaoSocial, String cnpj, String endereco, List<String> listaDeProdutos){
        
        Fornecedor fornecedor = new Fornecedor(razaoSocial, cnpj, endereco, listaDeProdutos);
        //TODO: Salva esse fornecedor no banco de dados, e os produtos da lista de produtos
        bdFornecedores.add(fornecedor);
        fornecedor.salvarFornecedor();
        
        
    }
    
    public Gerente getFornecedor(String keyDeBusca){
        
        //TODO: malipular banco de dados para pegar um Fornecedor
        return null;
        
    }
    
    public void cadastraSupervisor(String nome, String contato, String cpf, String codigoHash, Integer identificacao, String endereço){
        Supervisor supervisor = new Supervisor(nome,contato,cpf,codigoHash, identificacao,endereço);
       //TODO: Salva esse supervisor no banco de dados
       bdSupervisores.add(supervisor);
       supervisor.salvaSupervisor();
        
    }
    
    public Gerente getSupervisor(String keyDeBusca){
        
        //TODO: malipular banco de dados para pegar um Supervisor
        return null;
        
    }
    
     
    public void cadastrarVendedor(String nome, String contato, String cpf, String codigoHash, Integer identificacao,String endereço){
        Vendedor vendedor = new Vendedor(nome,  contato,  cpf,  codigoHash,  identificacao,endereço);
        //TODO: Salva esse produto no banco de dados
        bdVendedores.add(vendedor); 
    }
    
    public Vendedor getVendedor(String keyDeBusca){
        
        //TODO: malipular banco de dados para pegar um Vendedor
        return null;
        
    }
    
    public void comprarComFornecedor(String nomeFornecedor, String produto, int quantidade){
        
        //TODO
        //Ler banco de dados do fornecedor
        //Validar isso com Supervisor, comprar o produto
        //Salvar em um arquivo de relatorio;
        
    }
    
    public void emitirRelatorio(){
        
        //Escrita do relátorio em um arquivo da saída
    
    }
    
    public static List<Fornecedor> getBdFornecedores() {
        return bdFornecedores;
    }

    public static List<Supervisor> getBdSupervisores() {
        return bdSupervisores;
    }
    
    
}
