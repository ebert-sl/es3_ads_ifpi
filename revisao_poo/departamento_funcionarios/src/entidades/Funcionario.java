package entidades;
import java.util.Scanner;

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

    // Getters

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    // Métodos
    
    public abstract double calcularSalario(Scanner scanner);
}

