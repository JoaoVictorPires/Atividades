package models;

import services.GerenciadorDeElementos;

public class main {
    public static void main(String[] args) {
        GerenciadorDeElementos gerenciador = new GerenciadorDeElementos();
        Triangulo tri = new Triangulo(10, 12, 12);
        gerenciador.obterInfo(tri);


    }
}
