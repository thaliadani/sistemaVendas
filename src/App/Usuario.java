package App;
public class Usuario {
    String user;
    String senha;
    // Construtore para juntar as informações em um objeto
    public Usuario(String user, String senha){
        // This significa "este registro"
        this.user = user;
        this.senha = senha;
    }

    // Função para mostrar informações de usuário
    // void significa "Sem retorno"
    public void mostrarUsuario(){
        System.out.println("--------------------------------------------");
        System.out.println("------ Cadastro realizado com sucesso ------");
        System.out.println("--------------------------------------------");
        System.out.println("Usuario: " + this.user);
        System.out.println("Senha: " + this.senha);
    }
    // Função para retornar verdadeiro ou falso
    // Vendo se o login foi digitado corretamente para acessar a conta
    public boolean validarLogin(String userLogin, String senhaLogin){
        return (this.user.equals(userLogin) && this.senha.equals(senhaLogin));
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
