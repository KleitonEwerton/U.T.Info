/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.utinfo;


import com.u.t.info.src.Fornecedor;
import com.u.t.info.tables.TableFornecedores;
import com.u.t.info.view.TelaCadastroFornecedor;

import com.u.t.info.view.TelaGerente;
import java.util.ArrayList;
import java.util.List;


public class Sistema {
    
    public static void main(String [] args){
        
        List<String> arrayList = new ArrayList<>();
        arrayList.add("dasdad");
        arrayList.add("dasddsadsad");
        
        TelaGerente telagerente = new TelaGerente();
        telagerente.draw();
        
        TelaGerente.modelFornecedor.getListFornecedores().add(new Fornecedor("eee222eeee","2222eewrewre","2222REwrewre", arrayList));
        TelaGerente.modelFornecedor.getListFornecedores().add(new Fornecedor("ee333eeeee","3333eewrewre","333REwrewre", arrayList));
        
        
        
        TelaCadastroFornecedor tela = new TelaCadastroFornecedor();
        tela.desenha();
        tela.pack();
    }
    
}
