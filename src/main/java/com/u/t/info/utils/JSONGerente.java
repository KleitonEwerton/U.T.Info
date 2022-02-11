
package com.u.t.info.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.u.t.info.src.Gerente;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JSONGerente {
    
    public static String toJSONGerente(Gerente Gerente) {
        Gson gson = new Gson();
        return gson.toJson(Gerente);
    }

    public static String toJSONGerentes(List<Gerente> Gerentes) {
        Gson gson = new Gson();
        return gson.toJson(Gerentes);
    }

    public static Gerente toGerente(String json) {
        Gson gson = new Gson();
        Gerente gerente = gson.fromJson(json, Gerente.class);
        return gerente;
    }

    public static List<Gerente> toGerentes(String json) {
        Gson gson = new Gson();
        Type gerentesTipo = new TypeToken<ArrayList<Gerente>>() {
        }.getType();
        List<Gerente> Gerentes = gson.fromJson(json, gerentesTipo);
        return Gerentes;
    }
    
    public static List<Gerente> lerGerentes(){
        
        List<Gerente> listGerentes = new ArrayList<>();    
        
        try{
            
            String lerArquivo = Arquivo.lerArquivo("gerente");
            listGerentes = toGerentes(lerArquivo);
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao abrir o arquivo dos gerentes");
        }
        
        return listGerentes;
    }
    
}
