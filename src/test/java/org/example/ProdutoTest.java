package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {

    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Camiseta", 29.99, 100);
    }

    @Test
    void testGetNome() {
        assertEquals("Camiseta", produto.getNome());
    }

    @Test
    void testGetPreco() {
        assertEquals(29.99, produto.getPreco(), 0.001);
    }

    @Test
    void testGetQuantidade() {
        assertEquals(100, produto.getQuantidade());
    }

    @Test
    void testReduzirQuantidade() {
        produto.reduzirQuantidade(20);
        assertEquals(80, produto.getQuantidade());
    }

    @Test
    void testReduzirQuantidadeEstoqueInsuficiente() {
        assertThrows(IllegalArgumentException.class, () -> produto.reduzirQuantidade(150));
    }

    @Test
    void testToString() {
        String expected = "Camiseta - R$29.99 - Quantidade: 100";
        assertEquals(expected, produto.toString());
    }
}
