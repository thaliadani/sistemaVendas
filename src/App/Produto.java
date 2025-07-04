package App;
public class Produto {
    String nome;
    int estoque;
    int valor;

    public Produto(String nome, int estoque, int valor){
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
    }

    public void mostrarProduto(){
        System.out.println("Produto: " + this.nome);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("Estoque: " + this.valor);
    }
    // GET signifca buscar
    // Tipo de retorno de acordo com o tipo de dado a ser retornado
    public String getNome() {
        return nome;
    }
    // SET para alteração de informação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
