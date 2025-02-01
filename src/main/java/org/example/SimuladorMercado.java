package org.example;

import java.util.*;

public class SimuladorMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mercado mercado = new Mercado();

        while (true) {
            System.out.println("\n1. Adicionar Produto");
            System.out.println("2. Consultar Preço");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Exibir Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    mercado.adicionarProduto(new Produto(nome, preco, quantidade));
                    break;
                case 2:
                    System.out.print("Nome do Produto: ");
                    nome = scanner.nextLine();
                    System.out.println("Preço: " + mercado.consultarPreco(nome));
                    break;
                case 3:
                    System.out.print("Nome do Produto: ");
                    nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade = scanner.nextInt();
                    mercado.realizarVenda(nome, quantidade);
                    break;
                case 4:
                    mercado.exibirEstoque();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
