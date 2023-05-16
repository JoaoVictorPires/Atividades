package models;

public class main {
    public static void main(String[] args) {
        ContaCorrente contaPrincipal = new ContaCorrente("Big Smoke", "299.191.168-11", "142312");
        contaPrincipal.depositar(4000);
        contaPrincipal.depositar(3000);
        contaPrincipal.getExtrato();
        ContaCorrente contaTeste = new ContaCorrente("Teste", "912.528.478-40", "142578");
        contaTeste.depositar(4000);
        contaTeste.getExtrato();
        System.out.println(contaPrincipal.toString());
    }
}
