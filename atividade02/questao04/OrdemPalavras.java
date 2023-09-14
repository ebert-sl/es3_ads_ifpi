package atividade02.questao04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdemPalavras {
    private String[] array;

    public OrdemPalavras(String[] array) {
        this.array = array;
    }

    public void ordenar() { 
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    } 
 
    public void embaralhar() { 
        List<String> lista = Arrays.asList(array);

        Collections.shuffle(lista);
        lista.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
