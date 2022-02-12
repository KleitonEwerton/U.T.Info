package com.u.t.info.tables;

import com.u.t.info.src.Venda;
import com.u.t.info.utils.JSONVendas;
import static com.u.t.info.utils.JSONVendas.lerVendas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KleitonEwerton
 */
public class TableVendas extends AbstractTableModel{
    
    private final String[] colunas = new String[]{"Vendedor", "Produto","Valor"};
    private List<Venda> listVenda = new ArrayList<>();    
    
   
    public TableVendas(){
        
        listVenda = lerVendas();
        
    }
    
    @Override
    public String getColumnName(int indexColuna){
        return colunas[indexColuna];
    }
    
    @Override 
    public int getRowCount() {
        return this.listVenda.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int indexLinha, int indexColuna) {
        
        switch(indexColuna){
            
            case 0:
                return this.listVenda.get(indexLinha).getVendedor().getNome();      
            case 1:
                return this.listVenda.get(indexLinha).getProdutos();
            case 2:
                return this.listVenda.get(indexLinha).getValor();
            
        }
        return null;
        
    }
    
    
    public void atualizaTabela(){
        
        this.listVenda = lerVendas();
        this.fireTableDataChanged();
        
    }
    
}
