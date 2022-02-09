/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.tables;

import com.u.t.info.src.Funcionario;
import com.u.t.info.src.Gerente;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableFuncionarios extends AbstractTableModel{
    
    private final String[] colunas = new String[]{"Nome", "Contato", "CPF", "Codigo Hash", "Identificacao", "Endereço"};
    private final List<Funcionario> listFuncionarios = new ArrayList<>();    
    
   
    public TableFuncionarios(){
        listFuncionarios.add(new Gerente("Rfdsfdsfafa", "rafa.gmailfsdfsdfsf.com","1223333333211", "pdfsdsfdfsfdoooo", 12,"rua dfdsfdfsdfsfdfsas dores","120", "fdfsdf","nmddd","dfsdf",322));
        listFuncionarios.add(new Gerente("Rfdsfdsfafa", "rafa.gmailfsdfsdfsf.com","1223333333211", "pdfsdsfdfsfdoooo", 12,"rua dfdsfdfsdfsfdfsas dores","120", "fdfsdf","nmddd","dfsdf",322));
    }
    
    @Override
    public String getColumnName(int indexColuna){
        return colunas[indexColuna];
    }
    
    @Override 
    public int getRowCount() {
        return this.listFuncionarios.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int indexLinha, int indexColuna) {
        
        switch(indexColuna){
            
            case 0:
                return this.listFuncionarios.get(indexLinha).getNome();      
            case 1:
                return this.listFuncionarios.get(indexLinha).getContato();     
            case 2:
                return this.listFuncionarios.get(indexLinha).getCpf();
            case 3:
                return this.listFuncionarios.get(indexLinha).getCodigoHash(); 
            case 4:
                return this.listFuncionarios.get(indexLinha).getIdentificacao();
            case 5:
                return this.listFuncionarios.get(indexLinha).getRua() +" "+this.listFuncionarios.get(indexLinha).getNumero() ;
        }
        return null;
        
    }
    
  
    public void addNovoFuncionario(Funcionario produto){
        this.listFuncionarios.add(produto);      
        this.fireTableDataChanged();          
        
    }
    
    
    public void removerFuncionario(int indexLinha){
        this.listFuncionarios.remove(indexLinha);                        
        this.fireTableRowsDeleted(indexLinha,indexLinha); 
    }
    
    
    public Funcionario getFuncionario(int indexLinha){
        return this.listFuncionarios.get(indexLinha);
    }
}
