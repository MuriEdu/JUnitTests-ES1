package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadoTest {
    private Mercado mercado;

    @BeforeEach
    void setUp() {
        mercado = new Mercado();
        Produto produto = new Produto("Pão", 3.0, 30);
        mercado.adicionarProduto(produto);
    }

    @Test
    void testAdicionarProduto() {
        assertEquals(3.0, mercado.consultarPreco("Pão"));
    }

    @Test
    void testConsultarPrecoInexistente() {
        assertEquals(-1, mercado.consultarPreco("Manteiga"));
    }

    @Test
    void testRealizarVenda() {
        mercado.realizarVenda("Pão", 5);
        assertEquals(25, mercado.estoque.consultarProduto("Pão").getQuantidade());
    }
}