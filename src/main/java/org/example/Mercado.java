package org.example;


public class Mercado {
    public Estoque estoque;

    public Mercado() {
        this.estoque = new Estoque();
    }

    public void adicionarProduto(Produto produto) {
        estoque.adicionarProduto(produto);
    }

    public double consultarPreco(String nome) {
        Produto produto = estoque.consultarProduto(nome);
        return (produto != null) ? produto.getPreco() : -1;
    }

    public void realizarVenda(String nome, int quantidade) {
        Produto produto = estoque.consultarProduto(nome);
        if (produto != null && produto.getQuantidade() >= quantidade) {
            estoque.removerProduto(nome, quantidade);
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Produto indisponível ou estoque insuficiente.");
        }
    }

    public void exibirEstoque() {
        estoque.exibirEstoque();
    }
}
