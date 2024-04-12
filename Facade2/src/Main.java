public class Main {
    public static void main(String[] args) {
        Facade f = new Facade();
        Produto p = new Produto("Sabao", 0, 2);
        Produto p1 = new Produto("Banana", 1, 3);
        Cliente c = f.registrar("Ze", 123);
        f.comprar(p, c);
        f.comprar(p1, c);
        f.fecharCompra(c);
    }
}