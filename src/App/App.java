package App;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        // Declarando scanner "sc" para poder receber informações digitadas
        Scanner sc = new Scanner(System.in);
        boolean verificacaoLogin = false;
        // ArrayList para podemos adicionar vários produtos no sistema
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        ArrayList<Venda> listaVendas = new ArrayList<>();
        int codigoProduto;
        int codigoVendedor;
        int codigoCliente;
        int indiceProduto;
        int indiceVendedor;
        int indiceCliente;
        Cliente clienteVenda = new Cliente(null, null, null);
        Vendedor vendedorVenda = new Vendedor(null, null, null);
        Produto produtoVenda = new Produto(null, 1, 1);

        System.out.println("----------------------------------------------");
        System.out.println("------ Realizando cadastro de sua conta ------");
        System.out.println("----------------------------------------------");
        // Coletando dados do usuário - @ e senha
        System.out.println("Digite seu novo usuário");
        String user = sc.next();
        System.out.println("Digite sua nova senha");
        String senha = sc.next();
        // Chamando o construtor de Usuario para fazer o registro
        Usuario usuario = new Usuario(user, senha);
        // Chamando a função de mostrar as informações para o
        // usuário que acabou de ser cadastrado
        usuario.mostrarUsuario();
        // Adicionando repetição para várias tentativas de login
        while (true) {
            // Realizar validação de login
            System.out.println("------------------------------");
            System.out.println("------ Realizando login ------");
            System.out.println("-------------------------------");
            System.out.println("Digite seu nome de usuário: ");
            String userLogin = sc.next();
            System.out.println("Digite sua senha de acesso: ");
            String senhaLogin = sc.next();

            // Validação do login
            verificacaoLogin = usuario.validarLogin(userLogin, senhaLogin);
            if (verificacaoLogin) {
                System.out.println("Login realizado com sucesso");
                // Break para parar a repetição (apenas momentaneamente)
                break;
            } else {
                System.out.println("Cadastro inválido, Digite novamente: ");
            }
        }

        // Sistema para cadastro de produto
        while (verificacaoLogin) {
            System.out.println("----------------------------------------------");
            System.out.println("--------- Acesso ao sistema realizado --------");
            System.out.println("----------------------------------------------");
            System.out.println("Digite 1 para acessar o módulo produto");
            System.out.println("Digite 2 para acessar o módulo cliente");
            System.out.println("Digite 3 para acessar o módulo vendedor");
            System.out.println("Digite 4 para acessar o módulo venda");
            int menuModulo = sc.nextInt();

            switch (menuModulo) {
                case 1 -> {
                    System.out.println("Digite 1 para cadastrar produto");
                    System.out.println("Digite 2 para alterar o estoque de um produto");
                    System.out.println("Digite 3 para excluir um produto");
                    System.out.println("Digite 4 para visualizar todo o estoque");
                    System.out.println("Digite 5 para voltar ao menu inicial");
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("------- Realizando cadastro de produto -------");
                            System.out.println("----------------------------------------------");
                            // Coletando dados do usuário - @ e senha
                            System.out.println("Digite o nome do produto");
                            String nome = sc.next();
                            System.out.println("Digite a quantidade do estoque");
                            int estoque = sc.nextInt();
                            System.out.println("Digite o valor do produto");
                            int valor = sc.nextInt();
                            // Chamando o construtor de Produto para fazer o registro
                            Produto produto = new Produto(nome, estoque, valor);
                            produto.mostrarProduto();
                            listaProdutos.add(produto);
                        }
                        case 2 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("-------- Alterando estoque de produto --------");
                            System.out.println("----------------------------------------------");
                            // O indice é para mostrar qual o número do produto que vamos acessar
                            indiceProduto = 1;
                            for (Produto produto : listaProdutos) {
                                System.out.println("----------------------------------------------");
                                System.out.println("Produto " + indiceProduto + ": ");
                                produto.mostrarProduto();
                                indiceProduto += 1;
                                System.out.println("----------------------------------------------");
                            }
                            System.out.println("Digite o número do produto que você deseja alterar");
                            codigoProduto = sc.nextInt();
                            indiceProduto = 1;
                            for (Produto produto : listaProdutos) {
                                if (indiceProduto == codigoProduto) {
                                    System.out.println("Quantos produtos agora temos em estoque?");
                                    int estoqueNovo = sc.nextInt();
                                    produto.setEstoque(estoqueNovo);
                                }
                                indiceProduto += 1;
                            }
                            System.out.println("Estoque alterado com sucesso");
                        }
                        case 3 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("-------------- Excluir um produto ------------");
                            System.out.println("----------------------------------------------");
                            // O indice é para mostrar qual o número do produto que vamos acessar
                            indiceProduto = 1;
                            for (Produto produto : listaProdutos) {
                                System.out.println("----------------------------------------------");
                                System.out.println("Produto " + indiceProduto + ": ");
                                produto.mostrarProduto();
                                indiceProduto += 1;
                                System.out.println("----------------------------------------------");
                            }
                            System.out.println("Digite o número do produto que você deseja alterar");
                            codigoProduto = sc.nextInt();
                            codigoProduto -= 1;
                            listaProdutos.remove(codigoProduto);
                            System.out.println("Produto removido com sucesso");
                        }
                        case 4 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("--------- Listando todos os produtos ---------");
                            System.out.println("----------------------------------------------");
                            for (Produto produto : listaProdutos) {
                                produto.mostrarProduto();
                            }
                        }
                        default ->
                            System.out.println("Voltando ao menu inicial...");
                    }
                }
                case 2 -> {
                    System.out.println("Digite 1 para cadastrar cliente");
                    System.out.println("Digite 2 para listar clientes");
                    System.out.println("Digite 3 para voltar ao menu inicial");
                    int menuCliente = sc.nextInt();

                    switch (menuCliente) {
                        case 1 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("------------- Cadastrando cliente ------------");
                            System.out.println("----------------------------------------------");
                            System.out.println("Digite seu nome");
                            String nomeCliente = sc.next();
                            System.out.println("Digite seu cpf");
                            String cpfCliente = sc.next();
                            System.out.println("Digite o contato");
                            String contatoCliente = sc.next();
                            Cliente cliente = new Cliente(nomeCliente, cpfCliente, contatoCliente);
                            listaClientes.add(cliente);
                            System.out.println("Cliente adicionado com sucesso.");
                        }
                        case 2 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("--------- Listando todos os clientes ---------");
                            System.out.println("----------------------------------------------");
                            for (Cliente cliente : listaClientes) {
                                cliente.mostrarCliente();
                            }
                        }
                        default ->
                            System.out.println("Voltando ao menu inicial...");
                    }
                }
                case 3 -> {
                    System.out.println("Digite 1 para cadastrar vendedor");
                    System.out.println("Digite 2 para listar vendedores");
                    System.out.println("Digite 3 para voltar ao menu inicial");
                    int menuVendedor = sc.nextInt();
                    switch (menuVendedor) {
                        case 1 -> {
                            System.out.println("Digite seu nome");
                            String nomeVendedor = sc.next();
                            System.out.println("Digite seu cpf");
                            String cpfVendedor = sc.next();
                            System.out.println("Digite o contato");
                            String contatoVendedor = sc.next();
                            Vendedor vendedor = new Vendedor(nomeVendedor, cpfVendedor, contatoVendedor);
                            listaVendedores.add(vendedor);
                            System.out.println("Vendedor adicionado com sucesso.");
                        }
                        case 2 -> {
                            System.out.println("----------------------------------------------");
                            System.out.println("-------- Listando todos os vendedores --------");
                            System.out.println("----------------------------------------------");
                            for (Vendedor vendedor : listaVendedores) {
                                vendedor.mostrarVendedor();
                            }
                        }
                        default ->
                            System.out.println("Voltando ao menu inicial...");
                    }
                }
                case 4 -> {
                    if (!listaClientes.isEmpty() && !listaProdutos.isEmpty() && !listaVendedores.isEmpty()) {
                        System.out.println("Digite 1 para regitrar uma nova venda");
                        System.out.println("Digite 2 para visualizar todas as vendas");
                        System.out.println("digite 3 para voltar ao meu inicial");
                        int menuVenda = sc.nextInt();
                        switch (menuVenda) {
                            case 1 -> {
                                System.out.println("Tudo certo, digite o índice do cliente que você quer registrar a venda");
                                // Cliente
                                indiceCliente = 1;
                                for (Cliente cliente : listaClientes) {
                                    System.out.println("----------------------------------------------");
                                    System.out.println("Cliente " + indiceCliente + ": ");
                                    cliente.mostrarCliente();
                                    indiceCliente += 1;
                                    System.out.println("----------------------------------------------");
                                }
                                System.out.println("Digite o número do Cliente para registrar a venda");
                                codigoCliente = sc.nextInt();
                                codigoCliente -= 1;
                                indiceCliente = 1;
                                for (Cliente cliente : listaClientes) {
                                    if (indiceCliente == codigoCliente) {
                                        clienteVenda = cliente;
                                    }
                                    indiceCliente += 1;
                                }   // Produto
                                indiceProduto = 1;
                                for (Produto produto : listaProdutos) {
                                    System.out.println("----------------------------------------------");
                                    System.out.println("Produto " + indiceProduto + ": ");
                                    produto.mostrarProduto();
                                    indiceProduto += 1;
                                    System.out.println("----------------------------------------------");
                                }
                                System.out.println("Digite o número do produto para registrar a venda");
                                codigoProduto = sc.nextInt();
                                codigoProduto -= 1;
                                indiceProduto = 1;
                                for (Produto produto : listaProdutos) {
                                    if (indiceProduto == codigoProduto) {
                                        produtoVenda = produto;
                                    }
                                    indiceProduto += 1;
                                }   // Vendedores
                                indiceVendedor = 1;
                                for (Vendedor vendedor : listaVendedores) {
                                    System.out.println("----------------------------------------------");
                                    System.out.println("Vendedor " + indiceVendedor + ": ");
                                    vendedor.mostrarVendedor();
                                    indiceVendedor += 1;
                                    System.out.println("----------------------------------------------");
                                }
                                System.out.println("Digite o número do vendedor para registrar a venda");
                                codigoVendedor = sc.nextInt();
                                codigoVendedor -= 1;
                                indiceVendedor = 1;
                                for (Vendedor vendedor : listaVendedores) {
                                    if (indiceProduto == codigoVendedor) {
                                        vendedorVenda = vendedor;
                                    }
                                    indiceVendedor += 1;
                                }   // Registrando venda
                                Venda venda = new Venda(produtoVenda, clienteVenda, vendedorVenda);
                                listaVendas.add(venda);
                            }
                            case 2 -> {
                                System.out.println("----------------------------------------------");
                                System.out.println("---------- Listando todas as vendas ----------");
                                System.out.println("----------------------------------------------");
                                for (Venda venda : listaVendas) {
                                    venda.mostrarVenda();
                                }
                            }
                            default ->
                                System.out.println("Voltando ao menu inicial...");
                        }
                    } else {
                        System.out.println("Necessário termos ao menos um Cliente, um Produto e um Vendedor cadastrado");
                    }
                }
                default -> System.out.println("Codigo inválido, tente novamente");
            }
            sc.close();
        }

    }
}
