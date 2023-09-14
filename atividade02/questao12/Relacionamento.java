package atividade02.questao12;

enum Tipo {
    AMIGO,
    SEGUIDOR
}

public class Relacionamento {
    private Usuario remetente;
    private Usuario destinatario;
    private Tipo tipo;

    public Relacionamento(Usuario remetente, Usuario destinatario, Tipo tipo) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.tipo = tipo;
    }
}
