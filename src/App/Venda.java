package App;
public class Venda {
    Produto produto;
    Cliente cliente;

    public Venda(Produto produto, Cliente cliente){
        this.produto = produto;
        this.cliente = cliente;
    }

    public void mostrarVenda(){
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
    }
}
