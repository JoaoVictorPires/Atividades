package views;

import services.ProdutoService;

import java.util.Scanner;

public class InterfacePrincipalView {
    private static Scanner scanner;

    public InterfacePrincipalView() {
        scanner = new Scanner(System.in);
    }

    private void exibirMenuPrincipal(){
        System.out.println("Selecione uma opção");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Listar produtos cadastrados");
        System.out.println("0 - Sair");
    }

    public void executar() {
        int opcao = 1;
        while(opcao != 0) {
            this.exibirMenuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine();
            ProdutoView produtoView = new ProdutoView();
            ProdutoService produtoService = new ProdutoService();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Cadastrar novo produto");
                    produtoService.create(produtoView.cadastrarNovoProduto());
                }
                case 2 -> {
                    System.out.println("Excluir produto pelo ID");
                    int id = produtoView.lerId();
                    produtoService.delete(id);
                }
                case 3 -> {
                    System.out.println("Listar Produtos cadastrados");
                    produtoView.visualizarProdutos();
                }
                case 0 -> System.out.println("Até a próxima");
            }
        }
    }
}
