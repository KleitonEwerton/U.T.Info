
package com.u.t.info.utinfo;


import com.u.t.info.src.Gerente;
import com.u.t.info.view.TelaGerente;


public class Sistema {
    
    public static void main(String [] args){
        
        Gerente gerente = new Gerente("João da Silva", "32","130","fdfd",21,"rua","numero","cidade","uf", "cep",222.2);
        
        TelaGerente telagerente = new TelaGerente(gerente);
        
        telagerente.draw();
        
       
    }
    
}
