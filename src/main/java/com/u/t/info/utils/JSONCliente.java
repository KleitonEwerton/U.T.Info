package com.u.t.info.utils;

import com.u.t.info.src.Cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikolas
 */
public class JSONCliente {

    public static String toJSON(Cliente cliente) {
        Gson gson = new Gson();
        return gson.toJson(cliente);
    }

    public static String toJSON(List<Cliente> clientes) {
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
}
