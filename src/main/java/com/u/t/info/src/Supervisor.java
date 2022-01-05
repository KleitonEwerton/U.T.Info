/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;


public class Supervisor extends Funcionario{

	public Supervisor(String nome, String contato, String cpf, String codigoHash, Integer identificacao,
			String endereço) {
		super(nome, contato, cpf, codigoHash, identificacao, endereço);
		// TODO Auto-generated constructor stub
	}
	
	
	//se tiver produto em estoque autoriza compra
	public boolean ordemCompra(Produto produto, int qtdeCompra) {
		if(produto.getQtdeEstque()>qtdeCompra) {
			return true;
		}
		return false;
	}
	
	//se estoque for menor que estooque minimo exibe mensagem avisando que deve repor estoque
	public void controleEstoque(Produto produto) {
		if(produto.getQtdeEstque() < produto.getEstoqueMinimo()) {
			System.out.println("Comprar mais produtos, temos menos que o estoque minimo estipulado!!");
		}
	}
	
	//realiza devolução, se produto não estiver defeituoso ele volta pro estoque
	public void devolucao(Produto produto, boolean defeito, int qtdeDevolucao) {
		if(!defeito) {
			produto.setQtdeEstoque(produto.getQtdeEstque()+qtdeDevolucao);
		}
	}
        
        public void salvaSupervisor(){
            //TODO: salvar esse supervisor no banco de dados
            System.out.println("Supervisor salvo");
        }
	
}
