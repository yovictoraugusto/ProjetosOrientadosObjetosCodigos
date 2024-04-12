import java.util.ArrayList;

public class Carrinho {
    private double total;
    private ArrayList<Produto> produtos = new ArrayList<>();
    public Carrinho() {
    }

    static Carrinho create() {
        Carrinho c = new Carrinho();
        return c;
    }

    void adicionar(Produto p) {
        produtos.add(p);
    }

    public double getTotal() {
        for (Produto produto : produtos){
            total += produto.getPreco();
        }
        return total;
    }
}
