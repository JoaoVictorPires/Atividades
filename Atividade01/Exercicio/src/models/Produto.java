package models;

public class Produto {
    public int id;
    public String nome;
    public double preco;
    private static int contador = 0;




    private Produto(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){
        this.id = ++Produto.contador;
    }

    public Produto clone() {
        return new Produto(this.id, this.nome,this.preco);
    }



    public int getId() {
        return this.id;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}