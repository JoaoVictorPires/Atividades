package models;


public class Quadrilatero {
        private double ladoA;
        private double ladoB;
        private double ladoC;
        private double ladoD;
        public Quadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
            this.ladoD = ladoD;
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
        public double getLadoD() {
        return this.ladoD;
        }

        public double getArea() {
            String classificacao = this.getClassificacao();
            if(classificacao.equals("Quadrado"))
                return Math.pow(this.getLadoA(), 2);
            else if(classificacao.equals("Retângulo"))
                return this.getLadoA() * this.getLadoB();
            else
                return this.getLadoA() * this.getLadoB();

        }

        public double getPerimetro() {
            return this.getLadoA() + this.getLadoB() + this.getLadoC() + this.getLadoD();
        }

        public String getClassificacao() {
            if(this.getLadoA() == this.getLadoB() && this.getLadoB() == this.getLadoC() && this.getLadoC() == this.getLadoD())
                return "Quadrado";
            else if(this.getLadoA() == this.getLadoC() && this.getLadoB() == this.getLadoD())
                return "Retângulo";
            else
                return "Não identificado";
        }


}
