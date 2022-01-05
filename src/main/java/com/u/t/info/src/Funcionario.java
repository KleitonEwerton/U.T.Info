/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;


public class Funcionario {

    private String nome;
    private String contato;
    private String cpf;
    private String codigoHash;
    private Integer identificacao;
    private String endereço;

    public Funcionario(String nome, String contato, String cpf, String codigoHash, Integer identificacao, String endereço) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.codigoHash = codigoHash;
        this.identificacao = identificacao;
        this.endereço = endereço;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public void setIdentificacao(Integer identificacao) {
        this.identificacao = identificacao;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public Integer getIdentificacao() {
        return identificacao;
    }

    public String getEndereço() {
        return endereço;
    }
    
    
    
    
} 
