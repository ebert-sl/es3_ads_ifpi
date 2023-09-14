package atividade02.questao12;

import java.util.List;

public class Usuario {
    private List<Relacionamento> relacionamentos;

    public void adicionarRelacionamento(Relacionamento relacionamento) { 
        relacionamentos.add(relacionamento);
    }
}
