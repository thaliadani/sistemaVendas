package App;
public class Vendedor {
    String nome;
    String cpf;
    String contato;

    public Vendedor(String nome, String cpf,String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public void mostrarVendedor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Contato: " + this.contato);
    }

}
