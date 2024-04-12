public class Cliente {
    private String nome;
    private int id;
    private Carrinho carrinho;

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    static Cliente create(String nome, int id) {
        Cliente cl = new Cliente(nome, id);
        return cl;
    }
    void adicionarCarrinho(Carrinho c) {
        this.carrinho = c;
    }
    public Carrinho getCarrinho() {
        return carrinho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
