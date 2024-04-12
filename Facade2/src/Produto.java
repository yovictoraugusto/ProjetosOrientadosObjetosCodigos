public class Produto {
    private String nome;
    private int id;
    private double preco;

    public Produto(String nome, int id, double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    static Produto create(String nome, int id, double preco) {
        Produto p = new Produto(nome, id, preco);
        return p;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
