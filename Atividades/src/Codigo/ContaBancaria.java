package Codigo;

public class ContaBancaria {
    public String titular;
    public float saldo;

    public void imprimir(){
        System.out.println(this.titular);
        System.out.printf(String.valueOf(this.saldo));
    }
    public void deposito(int saldoAumenta){
        int saldo;
        this.saldo += saldoAumenta;
    }
    public void saque(int saldoDiminui){
        int saldo;
        this.saldo -= saldoDiminui;
    }
}
