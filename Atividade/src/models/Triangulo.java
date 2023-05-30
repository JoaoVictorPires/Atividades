package models;


public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public double getArea() {
        double perimetro = this.getPerimetro() / 2;
        return Math.sqrt(perimetro*
                (perimetro - this.getLadoA())*
                (perimetro - this.getLadoB())*
                (perimetro - this.getLadoC()));
    }

    public double getPerimetro() {
        return this.getLadoA() + this.getLadoB() + this.getLadoC();
    }
    public String getClassificacao() {
        if(this.getLadoA() == this.getLadoB() &&
                this.getLadoB() == this.getLadoC())
            return "Equilátero";
        else if (this.getLadoA() == this.getLadoB() ||
                this.getLadoA() == this.getLadoC() ||
                this.getLadoB() == this.getLadoC())
            return "Isósceles";
        else
            return "Escaleno";
    }

    public double getLadoA() {
        return this.ladoA;
    }

    public double getLadoB() {
        return this.ladoB;
    }

    public double getLadoC() {
        return this.ladoC;
    }
}