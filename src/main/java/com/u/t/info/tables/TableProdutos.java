/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.tables;

import com.u.t.info.src.Produto;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableProdutos extends AbstractTableModel{
    
    private final String[] colunas = new String[]{"Nome", "Codigo", "Preco de Compra", "Preco de Venda", "Fornecedor", "Descricao", "Modelo", "Estoque", "Estoque Minimo"};
    private final List<Produto> listProduto = new ArrayList<>();    
    
   
    public TableProdutos(){
        listProduto.add(new Produto("Not","wrewre",23232.4,3232.4,"Joao","DSDs","dsads",222,2323));
        listProduto.add(new Produto("No3ret","wrewwerere",23233332.4,3222332.4,"Jofdsfao","fsfDSDs","dsadfsds",22432,243323));
    }
    
    @Override
    public String getColumnName(int indexColuna){
        return colunas[indexColuna];
    }
    
    @Override 
    public int getRowCount() {
        return this.listProduto.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int indexLinha, int indexColuna) {
        
        switch(indexColuna){
            
            case 0:
                return this.listProduto.get(indexLinha).getNome();      
            case 1:
                return this.listProduto.get(indexLinha).getCodigo();     
            case 2:
                return this.listProduto.get(indexLinha).getPrecoCompra();
            case 3:
                return this.listProduto.get(indexLinha).getPrecoVenda(); 
            case 4:
                return this.listProduto.get(indexLinha).getFornecedor();
            case 5:
                return this.listProduto.get(indexLinha).getDescricao();
            case 6:
                return this.listProduto.get(indexLinha).getModelo();
            case 7:
                return this.listProduto.get(indexLinha).getQtdeEstoque();
            case 8:
                return this.listProduto.get(indexLinha).getEstoqueMinimo();
        }
        return null;
        
    }
    
  
    public void addNovoProduto(Produto produto){
        this.listProduto.add(produto);      
        this.fireTableDataChanged();          
        
    }
    
    
    public void removerProduto(int indexLinha){
        this.listProduto.remove(indexLinha);                        
        this.fireTableRowsDeleted(indexLinha,indexLinha); 
    }
    
    
    public Produto getProduto(int indexLinha){
        return this.listProduto.get(indexLinha);
    }
}
