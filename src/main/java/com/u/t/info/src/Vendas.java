package com.u.t.info.src;

import java.util.List;

public interface Vendas {

    public Vendedor getVendedor();

    public void setVendedor(Vendedor vendedor);

    public List<Produto> getProdutos();

    public void setProdutos(List<Produto> produtos);

    public double getValor();

    public void setValor(double valor);

}
