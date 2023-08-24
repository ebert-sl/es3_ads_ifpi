import java.util.Scanner;
import entidades.*;

public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar Departamento");
            System.out.println("2. Listar Departamentos");
            System.out.println("3. Excluir Departamento");
            System.out.println("4. Contratar Gerente");
            System.out.println("5. Contratar Vendedor");
            System.out.println("6. Demitir Funcionário");
            System.out.println("7. Listar Funcionários por Departamento");
            System.out.println("8. Calcular Salário de Vendedor");
            System.out.println("9. Calcular Salário de Gerente");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    empresa.criarDepartamento(scanner);
                    break;

                case 2:
                    empresa.listarDepartamentos();
                    break;

                case 3:
                    empresa.removerDepartamento(scanner);
                    break;

                case 4:
                    empresa.listarDepartamentos();

                    System.out.print("Digite o ID do departamento do gerente: ");
                    int idDepartamentoGerente = scanner.nextInt();
                    scanner.nextLine();
                    Departamento deptGerente = empresa.buscarDepartamentoPorId(idDepartamentoGerente);

                    if (deptGerente == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    }
                    deptGerente.adicionarGerente(empresa, scanner);
                    break;

                case 5:
                    empresa.listarDepartamentos();

                    System.out.print("Digite o ID do departamento do vendedor: ");
                    int idDepartamentoVendedor = scanner.nextInt();
                    scanner.nextLine();
                    Departamento deptVendedor = empresa.buscarDepartamentoPorId(idDepartamentoVendedor);

                    if (deptVendedor == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    }
                    deptVendedor.adicionarVendedor(empresa, scanner);
                    break;

                case 6:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoDemitir = scanner.nextInt();
                    Departamento departamentoDemitir = empresa.buscarDepartamentoPorId(idDepartamentoDemitir);
                    
                    if (departamentoDemitir == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    } 
                    departamentoDemitir.removerFuncionario(scanner);
                    break;

                case 7:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoListar = scanner.nextInt();
                    Departamento deptListar = empresa.buscarDepartamentoPorId(idDepartamentoListar);

                    if (deptListar == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    }
                    deptListar.listarFuncionarios();
                    break;
                
                case 8:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoCalcularSalarioVendedor = scanner.nextInt();
                    Departamento deptCalcularSalarioVendedor = empresa.buscarDepartamentoPorId(idDepartamentoCalcularSalarioVendedor);
                    
                    if (deptCalcularSalarioVendedor == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    }
                    System.out.print("Digite o ID do funcionário (vendedor) a ser calculado o salário: ");
                    int idVendedorCalcularSalario = scanner.nextInt();
                    scanner.nextLine();
                    Funcionario vendedorCalcularSalario = deptCalcularSalarioVendedor.buscarFuncionario(idVendedorCalcularSalario);
                    
                    if (!(vendedorCalcularSalario instanceof Vendedor)) {
                        System.out.println("Funcionário não é um vendedor.");
                        break;
                    }
                    vendedorCalcularSalario.calcularSalario(scanner);
                    break;

                case 9:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoCalcularSalarioGerente = scanner.nextInt();
                    Departamento deptCalcularSalarioGerente = empresa.buscarDepartamentoPorId(idDepartamentoCalcularSalarioGerente);
                    
                    if (deptCalcularSalarioGerente == null) {
                        System.out.println("Departamento não encontrado.");
                        break;
                    }
                    System.out.print("Digite o ID do funcionário (gerente) a ser calculado o salário: ");
                    int idGerenteCalcularSalario = scanner.nextInt();
                    scanner.nextLine();
                    Funcionario gerenteCalcularSalario = deptCalcularSalarioGerente.buscarFuncionario(idGerenteCalcularSalario);
                    
                    if (!(gerenteCalcularSalario instanceof Gerente)) {
                        System.out.println("Funcionário não é um gerente.");
                        break;
                    } 
                    gerenteCalcularSalario.calcularSalario(scanner);
                    break;

                case 10:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 10);

        scanner.close();
    }
}
