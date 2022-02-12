package com.u.t.info.utils;

import com.u.t.info.src.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JSONCliente {

    public static String toJSONCliente(Cliente cliente) {
        Gson gson = new Gson();
        return gson.toJson(cliente);
    }

    public static String toJSONClientes(List<Cliente> clientes) {
        Gson gson = new Gson();
        return gson.toJson(clientes);
    }

    public static Cliente toCliente(String json) {
        Gson gson = new Gson();
        Cliente cliente = gson.fromJson(json, Cliente.class);
        return cliente;
    }

    public static List<Cliente> toClientes(String json) {
        Gson gson = new Gson();
        Type clientesTipo = new TypeToken<ArrayList<Cliente>>() {
        }.getType();
        List<Cliente> clientes = gson.fromJson(json, clientesTipo);
        return clientes;
    }
    
    public static List<Cliente> lerCliente(){
        
        List<Cliente> listClientes = new ArrayList<>();    
        
        try{
            
            String lerArquivo = Arquivo.lerArquivo("arquivos/clientes.json");
            listClientes = toClientes(lerArquivo);
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro ao abrir o arquivo dos clientes");
        }
        
        return listClientes;
    }
}
