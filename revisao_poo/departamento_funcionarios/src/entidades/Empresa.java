package entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private List<Departamento> listaDepartamentos;

    public Empresa() {
        this.listaDepartamentos = new ArrayList<>();
    }

    public List<Departamento> getListaDepartamentos() {
        return this.listaDepartamentos;
    }

    // Create

    public void criarDepartamento(Scanner scanner) {
        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        Departamento novoDepartamento = new Departamento(this.getListaDepartamentos().size() + 1, nomeDepartamento);
        listaDepartamentos.add(novoDepartamento);
        System.out.println("Departamento criado com sucesso!");
    }

    // Read

    public Departamento buscarDepartamentoPorId(int id) {
        for (Departamento dept : listaDepartamentos) {
            if (dept.getId() == id) {
                return dept;
            }
        }
        return null;
    }

    public void listarDepartamentos() {
        if (listaDepartamentos.isEmpty()) {
            System.out.println("Não há departamentos na empresa.");
        } else {
            System.out.println("Lista de departamentos:");
            for (Departamento departamento : listaDepartamentos) {
            System.out.println("ID: " + departamento.getId() + ", Nome: " + departamento.getNome());
            }
        }
    }

    // Delete
    public void removerDepartamento(Scanner scanner) {
        System.out.print("Digite o ID do departamento a ser excluído: ");
        int idExcluir = scanner.nextInt();
        Departamento departamentoExcluir = this.buscarDepartamentoPorId(idExcluir);
        if (departamentoExcluir == null) {
            System.out.println("Departamento não encontrado.");
        } else {
            listaDepartamentos.remove(departamentoExcluir);
            System.out.println("Departamento excluído com sucesso!");
        }
    }
}

