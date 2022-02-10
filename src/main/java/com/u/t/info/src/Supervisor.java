/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.src;


public class Supervisor extends Funcionario{

	public Supervisor(String nome, String contato, String cpf, String codigoHash, Integer identificacao, String rua, String numero, String cidade, String uf, String cep, double salario) {
		super( nome,  contato,  cpf,codigoHash, identificacao, rua, numero, cidade, uf, cep, salario);
		// TODO Auto-generated constructor stub
	}
	
	
	//se tiver produto em estoque autoriza compra
	public boolean ordemCompra(Produto produto, int qtdeCompra) {
		if(produto.getQtdeEstoque()>qtdeCompra) {
			return true;
		}
		return false;
	}
	
	//se estoque for menor que estooque minimo exibe mensagem avisando que deve repor estoque
	public void controleEstoque(Produto produto) {
		if(produto.getQtdeEstoque() < produto.getEstoqueMinimo()) {
			System.out.println("Comprar mais produtos, temos menos que o estoque minimo estipulado!!");
		}
	}
	
	//realiza devolução, se produto não estiver defeituoso ele volta pro estoque
	public void devolucao(Produto produto, boolean defeito, int qtdeDevolucao) {
		if(!defeito) {
			produto.setQtdeEstoque(produto.getQtdeEstoque()+qtdeDevolucao);
		}
	}
	
	 public void salvaSupervisor(){
         //TODO: salvar esse supervisor no banco de dados
         System.out.println("Supervisor salvo");
     }

    @Override
    public double calculaPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
		

}
