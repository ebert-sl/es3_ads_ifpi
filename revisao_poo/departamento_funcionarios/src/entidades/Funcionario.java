package entidades;

public abstract class Funcionario {
    private int codigo;
    private String nome;
    private int idade;
    private double salarioBase;
    private Departamento departamento;

    public Funcionario(int codigo, String nome, int idade, double salarioBase, Departamento departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    // Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    // Métodos
    
    public abstract double calcularSalario();
}

