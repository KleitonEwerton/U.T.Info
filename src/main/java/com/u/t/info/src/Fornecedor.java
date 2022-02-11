/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;

import java.util.List;


public class Fornecedor {
    
    private String razaoSocial;
    private String cnpj;
    
    private List<String> listaDeProdutos;
    private final String rua;
    private final String numero;
    private final String cidade;
    private final String uf;
    private final String cep;
    
    public Fornecedor(String razaoSocial, String cnpj,List<String> listaDeProdutos, String rua, String numero, String cidade, String uf, String cep) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.rua = rua;
        this.numero = numero;
        this.cidade=cidade;
        this.uf = uf;
        this.cep = cep;
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

    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }

    
    public void setListaDeProdutos(List<String> listaDeProdutos) {
        //Podemos usar também a estrutura List
        this.listaDeProdutos = listaDeProdutos;
        
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }
    
    
}
