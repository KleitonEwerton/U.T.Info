
package com.u.t.info.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.u.t.info.src.Vendedor;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JSONVendedor {
    
    public static String toJSONVenda(Vendedor vendedor) {
        Gson gson = new Gson();
        return gson.toJson(vendedor);
    }

    public static String toJSONSVendedores(List<Vendedor> vendas) {
        Gson gson = new Gson();
        return gson.toJson(vendas);
    }

    public static Vendedor toVendedor(String json) {
        Gson gson = new Gson();
        Vendedor vendedor = gson.fromJson(json, Vendedor.class);
        return vendedor;
    }

    public static List<Vendedor> toVendedores(String json) {
        Gson gson = new Gson();
        Type vendedoresTipo = new TypeToken<ArrayList<Vendedor>>() {
        }.getType();
        List<Vendedor> vendedores = gson.fromJson(json, vendedoresTipo);
        return vendedores;
    }
    
    public static List<Vendedor> lerVendedores(){
        
        List<Vendedor> listVendedores = new ArrayList<>();    
        
        try{
            
            String lerArquivo = Arquivo.lerArquivo("vendas");
            listVendedores = toVendedores(lerArquivo);
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao abrir o arquivo das vendas");
        }
        
        return listVendedores;
    }
    
}
