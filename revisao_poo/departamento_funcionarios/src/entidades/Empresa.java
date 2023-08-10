package entidades;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Departamento> listaDepartamentos;

    public Empresa() {
        this.listaDepartamentos = new ArrayList<>();
    }

    public List<Departamento> getListaDepartamentos() {
        return this.listaDepartamentos;
    }

    // Create
    public void adicionarDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
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
    public void removerDepartamento(Departamento departamento) {
        listaDepartamentos.remove(departamento);
    }
}

