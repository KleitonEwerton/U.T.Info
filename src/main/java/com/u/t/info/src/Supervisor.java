/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;


public class Supervisor extends Funcionario{

    /*
    construtor
    */
	public Supervisor(String nome, String contato, String cpf, String codigoHash, String rua, String numero, String cidade, String uf, String cep, double salario) {
		super( nome,  contato,  cpf,codigoHash, rua, numero, cidade, uf, cep, salario);
		// TODO Auto-generated constructor stub
	}
	
	
	

    @Override
    public double calculaPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
		

}
