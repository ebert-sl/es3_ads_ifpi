package atividade02.questao05.Logico;

public class AcaoPlayer {
    private int opcao;

    public void decidir() {
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Jogar");
            System.out.println("2. Pular");
            System.out.println("3. Sair do Jogo");
            
            switch (opcao) {
                case 1:
                    // lógica da jogada
                case 2:
                    // pulo de rodada
                case 3:
                    // saída de jogo
            }
        } while (opcao != 0);
    }
}
