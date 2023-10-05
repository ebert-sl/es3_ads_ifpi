package questao04;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ValidacaoException {
        ImpostoDeRenda impostoDeRenda = new ImpostoDeRenda("00000000000", 
        Arrays.asList(1000.0, 2000.0, 3000.0, 4000.0), Arrays.asList(100.0, 200.0, 300.0));

        impostoDeRenda.processar();
    }
}
