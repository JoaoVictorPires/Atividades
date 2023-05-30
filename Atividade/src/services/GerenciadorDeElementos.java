package services;

import models.Circulo;
import models.Quadrilatero;
import models.Triangulo;

public class GerenciadorDeElementos {
        public void obterInfo(Triangulo triangulo){
            System.out.println("Triangulo");
            System.out.println("Perimetro: " + triangulo.getPerimetro());
            System.out.println("Área: " + triangulo.getArea());
            System.out.println("Classificação: " + triangulo.getClassificacao());
        }
        public void obterInfo(Quadrilatero quadrilatero){
            System.out.println("Quadrilatero");
            System.out.println("Perimetro: " + quadrilatero.getPerimetro());
            System.out.println("Área: " + quadrilatero.getArea());
            System.out.println("Classificação: " + quadrilatero.getClassificacao());

        }
        public void obterInfo(Circulo circulo){
            System.out.println("Circulo");
            System.out.println("Perimetro: " + circulo.getPerimetro());
            System.out.println("Área: " + circulo.getArea());
            System.out.println("Raio: " + circulo.getRaio());
        }
}
