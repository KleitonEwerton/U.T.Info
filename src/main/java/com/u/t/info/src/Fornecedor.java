/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

import java.util.List;


public class Fornecedor {
    
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private List<String> listaDeProdutos;
    
    public Fornecedor(String razaoSocial, String cnpj,String endereco, List<String> listaDeProdutos) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.listaDeProdutos = listaDeProdutos;

    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }

    
    public void setListaDeProdutos(List<String> listaDeProdutos) {
        //Podemos usar também a estrutura List
        this.listaDeProdutos = listaDeProdutos;
        
    }
    
    public void salvarFornecedor(){
        
        //TODO: salvar o fornecedor em uma arquivo do banco de dados
        System.out.println("Fornecedor salvo");
    }
    
    
    
    
}
