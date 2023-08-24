package entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Departamento {
    private int id;
    private String nome;
    private List<Funcionario> listaFuncionarios;

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listaFuncionarios = new ArrayList<>();
    }

    // Getters

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public List<Funcionario> getListaFuncionarios() {
        return this.listaFuncionarios;
    }

    // Create

    public void adicionarFuncionario(Funcionario funcionario) {
        int posicao = buscarFuncionarioPorCodigo(funcionario.getCodigo());
        if (posicao != -1) {
            System.out.println("ERRO: codigo para funcionario informado já cadastrado.");   
        } else {
            getListaFuncionarios().add(funcionario);
            System.out.println("Funcionário contratado com sucesso!");
        }
    }
    
    public void adicionarGerente(Empresa empresa, Scanner scanner) {
        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Digite a idade do gerente: ");
        int idadeGerente = scanner.nextInt();
        System.out.print("Digite o salário base do gerente: ");
        double salarioBaseGerente = scanner.nextDouble();
        scanner.nextLine();

        Gerente novoGerente = new Gerente(this.getListaFuncionarios().size() + 1, 
        nomeGerente, idadeGerente, salarioBaseGerente, this);
        this.adicionarFuncionario(novoGerente);
    }

    public void adicionarVendedor(Empresa empresa, Scanner scanner) {
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        System.out.print("Digite a idade do vendedor: ");
        int idadeVendedor = scanner.nextInt();
        System.out.print("Digite o salário base do vendedor: ");
        double salarioBaseVendedor = scanner.nextDouble();
        scanner.nextLine();

        Vendedor novoVendedor = new Vendedor(this.getListaFuncionarios().size() + 1, 
        nomeVendedor, idadeVendedor, salarioBaseVendedor, this);
        this.adicionarFuncionario(novoVendedor);
    }

    // Read
    private int buscarFuncionarioPorCodigo(int codigo){
        for (int i=0; i<listaFuncionarios.size(); i++) {
            if (getListaFuncionarios().get(i).getCodigo() == codigo) {
                return i;                                                                       
            }
        }
        return -1;                                                                              
    }

    public Funcionario buscarFuncionario(int codigo){
        int posicao = buscarFuncionarioPorCodigo(codigo);
        if (posicao == -1) {
            System.out.println("ERRO: funcionario nao encontrado.");                                                                      
            return null;  
        }                                                                             
        return getListaFuncionarios().get(posicao);                                                                       
    }

    public void listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Não há funcionários neste departamento.");
        } 

        System.out.println("Funcionários do departamento " + nome + ":");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Código: " + funcionario.getCodigo() +
                                ", Nome: " + funcionario.getNome() +
                                ", Idade: " + funcionario.getIdade() +
                                ", Salário: " + funcionario.getSalarioBase() +
                                ", Departamento: " + nome);
        }
    }

    // Update
    public void editarFuncionario(int codigo, Funcionario novoFuncionario) {
        int posicao = buscarFuncionarioPorCodigo(codigo);
        if (posicao == -1) {  
            System.out.println("ERRO: funcionario nao encontrado.");                              
        } 
        getListaFuncionarios().set(posicao, novoFuncionario);                                   
    }

    // Delete
    public void removerFuncionario(Scanner scanner) {
        System.out.print("Digite o ID do funcionário a ser demitido: ");
        int codigo = scanner.nextInt();
        int posicao = buscarFuncionarioPorCodigo(codigo);

        if (posicao == -1) {
            System.out.println("ERRO: funcionario nao encontrado."); 
        }                                                                                 
        getListaFuncionarios().remove(posicao);
        System.out.println("Funcionário demitido com sucesso do departamento " + 
        this.getNome() + ".");  
    }
}
    