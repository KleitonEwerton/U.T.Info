package com.u.t.info.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.u.t.info.src.Fornecedor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class JSONFornecedor {
    
    public static String toJSONFornecedor(Fornecedor fornecedor) {
        Gson gson = new Gson();
        return gson.toJson(fornecedor);
    }

    public static String toJSONFornecedores(List<Fornecedor> fornecedores) {
        Gson gson = new Gson();
        return gson.toJson(fornecedores);
    }

    public static Fornecedor toFornecedor(String json) {
        Gson gson = new Gson();
        Fornecedor fornecedor = gson.fromJson(json, Fornecedor.class);
        return fornecedor;
    }

    public static List<Fornecedor> toFornecedores(String json) {
        Gson gson = new Gson();
        Type fornecedoresTipo = new TypeToken<ArrayList<Fornecedor>>() {
        }.getType();
        List<Fornecedor> fornecedores = gson.fromJson(json, fornecedoresTipo);
        return fornecedores;
    }
    
}
