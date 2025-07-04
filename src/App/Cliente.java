package App;
public class Cliente {
    String nome;
    String cpf;
    String contato;
    
    public Cliente(String nome, String cpf, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public void mostrarCliente(){
        System.out.println("nome: " + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("contato: " + this.contato);
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
}
