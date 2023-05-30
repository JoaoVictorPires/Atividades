package views;

import models.Produto;
import services.ProdutoService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoView {
    private Scanner scanner;
    public ProdutoView(){
        this.scanner = new Scanner(System.in);
    }
    public void visualizarProdutos(){
        ProdutoService produtoService = new ProdutoService();
        System.out.println(produtoService.get());
    }
    public Produto cadastrarNovoProduto(){
        Produto a = new Produto();
        System.out.println("Digite o id do produto: ");
        a.setId(this.scanner.nextInt());
        this.scanner.nextLine();
        System.out.println("Digite o nome do Produto: ");
        a.setNome(this.scanner.nextLine());
        System.out.println("Digite o preço do Produto: ");
        return a;
    }
    public int lerId(){
        System.out.println("Digite o ID desejado: ");
        return this.scanner.nextInt();
    }
}
