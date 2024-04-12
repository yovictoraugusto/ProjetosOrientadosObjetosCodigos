public class Facade {
    BancoDeDados banco  = new BancoDeDados();
    public Cliente registrar(String nome, int id){
        Cliente c = Cliente.create(nome, id);
        Carrinho ca = Carrinho.create();
        c.adicionarCarrinho(ca);
        return c;
    }

    public void comprar(Produto produto, Cliente cliente){
        Cliente c = banco.selectCliente(cliente);
        Produto p = banco.selectProduto(produto);
        c.getCarrinho().adicionar(p);
    }

    public void fecharCompra(Cliente cliente){
        Cliente c = banco.selectCliente(cliente);
        double valor = c.getCarrinho().getTotal();
        banco.processarPagamento(c, valor);
    }

}
