package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstoqueTest {
    private Estoque estoque;
    private Produto produto;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
        produto = new Produto("Óleo", 12.5, 20);
        estoque.adicionarProduto(produto);
    }

    @Test
    void testAdicionarEConsultarProduto() {
        assertEquals(produto, estoque.consultarProduto("Óleo"));
    }

    @Test
    void testRemoverProduto() {
        estoque.removerProduto("Óleo", 5);
        assertEquals(15, estoque.consultarProduto("Óleo").getQuantidade());
    }
}
