package entidades;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String nome;
    private List<Funcionario> listaFuncionarios;

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listaFuncionarios = new ArrayList<>();
    }

    // Getters e Setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFuncionarios() {
        return this.listaFuncionarios;
    }

    // Create
    public void adicionarFuncionario(Funcionario funcionario) {
        int posicao = buscarFuncionarioPorCodigo(funcionario.getCodigo());
        if(posicao == -1){                                                                      
            getListaFuncionarios().add(funcionario);
        }else{                                                                                  
            System.out.println("ERRO: codigo para funcionario informado já cadastrado.");
        }
    }

    // Read
    private int buscarFuncionarioPorCodigo(int codigo){
        for(int i=0; i<listaFuncionarios.size(); i++){
            if(getListaFuncionarios().get(i).getCodigo() == codigo){
                return i;                                                                       
            }
        }
        return -1;                                                                              
    }

    public Funcionario buscarFuncionario(int codigo){
        int posicao = buscarFuncionarioPorCodigo(codigo);
        if(posicao != -1){                                                                      
            return getListaFuncionarios().get(posicao);
        }else{                                                                                  
            System.out.println("ERRO: funcionario nao encontrado.");
            return null;                                                                        
        }
    }

    public void listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Não há funcionários neste departamento.");
        } else {
            System.out.println("Funcionários do departamento " + nome + ":");
            for (Funcionario funcionario : listaFuncionarios) {
                System.out.println("Código: " + funcionario.getCodigo() +
                                   ", Nome: " + funcionario.getNome() +
                                   ", Idade: " + funcionario.getIdade() +
                                   ", Salário: " + funcionario.getSalarioBase() +
                                   ", Departamento: " + nome);
            }
        }
    }

    // Update
    public void editarFuncionario(int codigo, Funcionario novoFuncionario){
        int posicao = buscarFuncionarioPorCodigo(codigo);
        if(posicao != -1){                                                                     
            getListaFuncionarios().set(posicao, novoFuncionario);                               
        }else{
            System.out.println("ERRO: funcionario nao encontrado.");                          
        }
    }

    // Delete
    public void removerFuncionario(int codigo) {
        int posicao = buscarFuncionarioPorCodigo(codigo);
        if(posicao != -1){                                                                      
            getListaFuncionarios().remove(posicao);
        }else{                                                                                  
            System.out.println("ERRO: funcionario nao encontrado.");
        }
    }
}
    