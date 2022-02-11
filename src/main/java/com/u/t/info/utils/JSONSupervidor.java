
package com.u.t.info.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.u.t.info.src.Supervisor;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONSupervidor {
    
    public static String toJSONSupervisor(Supervisor supervisor) {
        Gson gson = new Gson();
        return gson.toJson(supervisor);
    }

    public static String toJSONSupervisoress(List<Supervisor> supervisores) {
        Gson gson = new Gson();
        return gson.toJson(supervisores);
    }

    public static Supervisor toSupervisor(String json) {
        Gson gson = new Gson();
        Supervisor supervisor = gson.fromJson(json, Supervisor.class);
        return supervisor;
    }

    public static List<Supervisor> toSupervisores(String json) {
        Gson gson = new Gson();
        Type supervisoresTipo = new TypeToken<ArrayList<Supervisor>>() {
        }.getType();
        List<Supervisor> supervisores = gson.fromJson(json, supervisoresTipo);
        return supervisores;
    }
    
    public static List<Supervisor> lerSupervisor(){
        
        List<Supervisor> listSupervisores = new ArrayList<>();    
        
        try{
            
            String lerArquivo = Arquivo.lerArquivo("supervisor");
            listSupervisores = toSupervisores(lerArquivo);
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao abrir o arquivo dos supervisores");
        }
        
        return listSupervisores;
    }
    
}
