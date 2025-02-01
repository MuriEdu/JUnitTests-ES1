package org.example;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public Produto consultarProduto(String nome) {
        return produtos.get(nome);
    }

    public void removerProduto(String nome, int quantidade) {
        Produto produto = produtos.get(nome);
        if (produto != null) {
            produto.reduzirQuantidade(quantidade);
        }
    }

    public void exibirEstoque() {
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}

