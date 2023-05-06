package Code06;

public class Funcionario {
    public String nome;
    public String cargo;
    public float salario;
    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cargo);
        System.out.printf(String.valueOf(this.salario));
    }
}
