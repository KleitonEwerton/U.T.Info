package com.u.t.info.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.u.t.info.src.Produto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONProduto {
    public static String toJSON(Produto produto) {
        Gson gson = new Gson();
        return gson.toJson(produto);
    }

    public static String toJSON(List<Produto> produtos) {
        Gson gson = new Gson();
        return gson.toJson(produtos);
    }

    public static Produto toProduto(String json) {
        Gson gson = new Gson();
        Produto produto = gson.fromJson(json, Produto.class);
        return produto;
    }

    public static List<Produto> toProdutos(String json) {
        Gson gson = new Gson();
        Type produtosTipo = new TypeToken<ArrayList<Produto>>() {
        }.getType();
        List<Produto> produtos = gson.fromJson(json, produtosTipo);
        return produtos;
    }
}
