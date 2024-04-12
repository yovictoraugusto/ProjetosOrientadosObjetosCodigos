public class BancoDeDados {
    public Cliente selectCliente(Cliente c){
        System.out.println("Selecionando Cliente " + c.getNome());
        return c;
    }

    public Produto selectProduto(Produto p){
        System.out.println("Selecionando produto " + p.getNome());
        return p;
    }

    public void processarPagamento(Cliente cliente, double valor){
        System.out.println("Processando pagamento de " + cliente.getNome() + " de " + valor);
    }
}
