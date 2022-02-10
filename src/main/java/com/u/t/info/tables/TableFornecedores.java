/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.tables;

import com.u.t.info.src.Fornecedor;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableFornecedores extends AbstractTableModel{
    
    private final String[] colunas = new String[]{"Razao Social","CNPJ","Endereço", "Lista De Produtos"};
    private final List<Fornecedor> listFornecedores = new ArrayList<>();    
    
   
    public TableFornecedores(){
        
        
        
    }
    
    @Override
    public String getColumnName(int indexColuna){
        return colunas[indexColuna];
    }
    
    @Override 
    public int getRowCount() {
        return this.listFornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int indexLinha, int indexColuna) {
        
        switch(indexColuna){
            
            case 0:
                return this.listFornecedores.get(indexLinha).getRazaoSocial();      
            case 1:
                return this.listFornecedores.get(indexLinha).getCnpj();     
            case 2:
                return this.listFornecedores.get(indexLinha).getEndereco();
            case 3:
                return this.listFornecedores.get(indexLinha).getListaDeProdutos(); 
            
        }
        return null;
        
    }
    
  
    public void addNovoFornecedor(Fornecedor produto){
        this.listFornecedores.add(produto);      
        this.fireTableDataChanged();          
        
    }
    
    
    public void removerFornecedor(int indexLinha){
        this.listFornecedores.remove(indexLinha);                        
        this.fireTableRowsDeleted(indexLinha,indexLinha); 
    }
    
    
    public Fornecedor getFornecedor(int indexLinha){
        return this.listFornecedores.get(indexLinha);
    }

    public List<Fornecedor> getListFornecedores() {
        return listFornecedores;
    }
    
}
