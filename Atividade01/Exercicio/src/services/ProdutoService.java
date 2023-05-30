package services;

import models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {

    private static ArrayList<Produto> dados;
    private Scanner scanner;

    public ProdutoService(){
        if (ProdutoService.dados == null)
            ProdutoService.dados = new ArrayList<>();}
    public Produto get(int id){
            for (Produto a : ProdutoService.dados){
                if (a.getId() == id){
                    return a.clone();
                }
            }
            return null;
    }
    public ArrayList<Produto> get(){
        return (ArrayList<Produto>) ProdutoService.dados.clone();
    }
    public void create(Produto produto){
        ProdutoService.dados.add(produto.clone());
    }
    public void delete(int id){
        Produto produtoASerExcluido = null;
        for (Produto a : ProdutoService.dados){
            if (a.getId() == id){
                produtoASerExcluido = a;
            }
        }
        if (produtoASerExcluido != null){
            ProdutoService.dados.remove(produtoASerExcluido);
        }
    }
    public int count(){
        return ProdutoService.dados.size();
    }
}

