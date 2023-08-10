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
                    System.out.print("Digite o nome do departamento: ");
                    String nomeDepartamento = scanner.nextLine();
                    Departamento novoDepartamento = new Departamento(empresa.getListaDepartamentos().size() + 1, nomeDepartamento);
                    empresa.adicionarDepartamento(novoDepartamento);
                    System.out.println("Departamento criado com sucesso!");
                    break;

                case 2:
                    empresa.listarDepartamentos();
                    break;

                case 3:
                    System.out.print("Digite o ID do departamento a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    Departamento departamentoExcluir = empresa.buscarDepartamentoPorId(idExcluir);
                    if (departamentoExcluir != null) {
                        empresa.removerDepartamento(departamentoExcluir);
                        System.out.println("Departamento excluído com sucesso!");
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = scanner.nextLine();
                    System.out.print("Digite a idade do gerente: ");
                    int idadeGerente = scanner.nextInt();
                    System.out.print("Digite o salário base do gerente: ");
                    double salarioBaseGerente = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Departamentos disponíveis:");
                    for (Departamento dept : empresa.getListaDepartamentos()) {
                        System.out.println("ID: " + dept.getId() + ", Nome: " + dept.getNome());
                    }
                    System.out.print("Digite o ID do departamento do gerente: ");
                    int idDepartamentoGerente = scanner.nextInt();
                    scanner.nextLine();
                    Departamento deptGerente = empresa.buscarDepartamentoPorId(idDepartamentoGerente);
                    if (deptGerente != null) {
                        Gerente novoGerente = new Gerente(deptGerente.getListaFuncionarios().size() + 1, nomeGerente, idadeGerente, salarioBaseGerente, deptGerente);
                        deptGerente.adicionarFuncionario(novoGerente);
                        System.out.println("Gerente contratado com sucesso!");
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do vendedor: ");
                    String nomeVendedor = scanner.nextLine();
                    System.out.print("Digite a idade do vendedor: ");
                    int idadeVendedor = scanner.nextInt();
                    System.out.print("Digite o salário base do vendedor: ");
                    double salarioBaseVendedor = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Departamentos disponíveis:");
                    for (Departamento dept : empresa.getListaDepartamentos()) {
                        System.out.println("ID: " + dept.getId() + ", Nome: " + dept.getNome());
                    }
                    System.out.print("Digite o ID do departamento do vendedor: ");
                    int idDepartamentoVendedor = scanner.nextInt();
                    scanner.nextLine();
                    Departamento deptVendedor = empresa.buscarDepartamentoPorId(idDepartamentoVendedor);
                    if (deptVendedor != null) {
                        Vendedor novoVendedor = new Vendedor(deptVendedor.getListaFuncionarios().size() + 1, nomeVendedor, idadeVendedor, salarioBaseVendedor, deptVendedor);
                        deptVendedor.adicionarFuncionario(novoVendedor);
                        System.out.println("Vendedor contratado com sucesso!");
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoDemitir = scanner.nextInt();
                    Departamento departamentoDemitir = empresa.buscarDepartamentoPorId(idDepartamentoDemitir);
                    
                    if (departamentoDemitir != null) {
                        System.out.print("Digite o ID do funcionário a ser demitido: ");
                        int idFuncionarioDemitir = scanner.nextInt();
                        Funcionario funcionarioDemitir = departamentoDemitir.buscarFuncionario(idFuncionarioDemitir);
                        
                        if (funcionarioDemitir != null) {
                            departamentoDemitir.removerFuncionario(idFuncionarioDemitir);
                            System.out.println("Funcionário demitido com sucesso do departamento " + departamentoDemitir.getNome() + ".");
                        } else {
                            System.out.println("Funcionário não encontrado.");
                        }
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 7:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoListar = scanner.nextInt();
                    Departamento deptListar = empresa.buscarDepartamentoPorId(idDepartamentoListar);
                    if (deptListar != null) {
                        deptListar.listarFuncionarios();
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;
                
                case 8:
                    System.out.print("Digite o ID do departamento: ");
                    int idDepartamentoCalcularSalarioVendedor = scanner.nextInt();
                    Departamento deptCalcularSalarioVendedor = empresa.buscarDepartamentoPorId(idDepartamentoCalcularSalarioVendedor);
                    
                    if (deptCalcularSalarioVendedor != null) {
                        System.out.print("Digite o ID do funcionário (vendedor) a ser calculado o salário: ");
                        int idFuncionarioCalcularSalario = scanner.nextInt();
                        scanner.nextLine();
                        Funcionario funcionarioCalcularSalario = deptCalcularSalarioVendedor.buscarFuncionario(idFuncionarioCalcularSalario);
                        
                        if (funcionarioCalcularSalario instanceof Vendedor) {
                            Vendedor vendedor = (Vendedor) funcionarioCalcularSalario;
                            
                            System.out.print("Digite a quantidade de horas extras do vendedor: ");
                            double horasExtras = scanner.nextDouble();
                            vendedor.adicionarHoras(horasExtras);
                            
                            System.out.print("Digite o valor de vendas realizadas pelo vendedor: ");
                            double valorVendas = scanner.nextDouble();
                            vendedor.adicionarValorVendas(valorVendas);
                            
                            vendedor.calcularSalario();
                            
                            vendedor.realizarPagamento();
                        } else {
                            System.out.println("Funcionário não é um vendedor.");
                        }
                    } else {
                        System.out.println("Departamento não encontrado.");
                    }
                    break;

                case 9:
                System.out.print("Digite o ID do departamento: ");
                int idDepartamentoCalcularSalarioGerente = scanner.nextInt();
                Departamento deptCalcularSalarioGerente = empresa.buscarDepartamentoPorId(idDepartamentoCalcularSalarioGerente);
                
                if (deptCalcularSalarioGerente != null) {
                    System.out.print("Digite o ID do funcionário (gerente) a ser calculado o salário: ");
                    int idFuncionarioCalcularSalario = scanner.nextInt();
                    scanner.nextLine();
                    Funcionario funcionarioCalcularSalario = deptCalcularSalarioGerente.buscarFuncionario(idFuncionarioCalcularSalario);
                    
                    if (funcionarioCalcularSalario instanceof Gerente) {
                        Gerente gerente = (Gerente) funcionarioCalcularSalario;
                        
                        System.out.print("Digite a bonificação desejada (em decimal, por exemplo, 0,1 para 10%): ");
                        double bonificacao = scanner.nextDouble();
                        gerente.setBonificacao(bonificacao);
                        
                        double salarioCalculado = gerente.calcularSalario();
                        System.out.println("Salário calculado para o gerente: " + salarioCalculado);
                    } else {
                        System.out.println("Funcionário não é um gerente.");
                    }
                } else {
                    System.out.println("Departamento não encontrado.");
                }
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
