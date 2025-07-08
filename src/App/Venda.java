package App;
public class Venda {
    Produto produto;
    Cliente cliente;
    Vendedor vendedor;

    public Venda(Produto produto, Cliente cliente, Vendedor vendedor){
        this.produto = produto;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void mostrarVenda(){
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Produto: " + this.produto);
        System.out.println("Vendedor: " + this.vendedor);
    }
}
