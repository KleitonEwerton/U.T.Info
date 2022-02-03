/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.utinfo;

import com.u.t.info.src.Gerente;
import com.u.t.info.view.TelaGerente;
import java.util.ArrayList;
import java.util.List;


public class Sistema {
    
    public static void main(String [] args){
        
        /*Gerente gerente = new Gerente("Junior","32-989999999","123.333.884.-22","dsssdete35nkbfsdf",22,"Rua que não existe; Nª: desconhecido");
        gerente.cadastraSupervisor("Joao", "32", "32333", "popopsdaj39", 33, "Nunca");
        
        List <String> listaProdutos = new ArrayList();
        listaProdutos.add("SSD");
        listaProdutos.add("HD");
        gerente.cadastrarFornecedor("Joao", "fds", "Chega", listaProdutos);
        gerente.cadastrarProduto("SSD", "fff", 0, 0,"Joao" , "Mais rapido", "Melhor que tem",44,3);*/
        
        TelaGerente telagerente = new TelaGerente();
        telagerente.draw();
    }
    
}
