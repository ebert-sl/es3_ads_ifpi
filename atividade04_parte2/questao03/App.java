package questao03;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        PersistenciaJSON persistenciaJSON = new PersistenciaJSON();

        persistenciaJSON.salvar("Teste", "questao03/output/resultado.json");
    }
}
