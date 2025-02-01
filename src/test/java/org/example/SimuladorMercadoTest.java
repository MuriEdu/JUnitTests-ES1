package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimuladorMercadoTest {
    private Mercado mercado;
    private Produto produto;

    @BeforeEach
    void setUp() {
        mercado = new Mercado();
        produto = new Produto("Café", 18.0, 25);
        mercado.adicionarProduto(produto);
    }

    @Test
    void testFluxoSimulador() {
        assertEquals(18.0, mercado.consultarPreco("Café"));
        mercado.realizarVenda("Café", 5);
        assertEquals(20, mercado.estoque.consultarProduto("Café").getQuantidade());
    }
}