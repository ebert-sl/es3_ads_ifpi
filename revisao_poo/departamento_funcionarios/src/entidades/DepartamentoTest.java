package entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartamentoTest {
	
	@Test
	void testAdicionarFuncionario() {
		Departamento departamento = new Departamento(1, "Departamento de Teste");
		
		Gerente gerente1 = new Gerente(1, "Gerente 1", 30, 5500.0, departamento);
		Vendedor vendedor1 = new Vendedor(2, "Vendedor 1", 22, 5000.0, departamento);
		
		departamento.adicionarFuncionario(gerente1);
        assertEquals(1, departamento.getListaFuncionarios().size());

        departamento.adicionarFuncionario(gerente1);
        assertEquals(1, departamento.getListaFuncionarios().size());

        departamento.adicionarFuncionario(vendedor1);
        assertEquals(2, departamento.getListaFuncionarios().size());
	}
	
}