package atividade02.questao04;

import java.util.Arrays;

public class FormatarPalavras {
    private String texto;

    public FormatarPalavras(String texto) {
        this.texto = texto;
    }

    public String removerEspacos() {
        String textoComTrim = texto.trim();
        String textoSemEspacos = textoComTrim.replaceAll("\s+", " ");
        return textoSemEspacos;
    } 
 
    public String quebrarEmPalavras() { 
        String textoSemEspacos = removerEspacos();
        String[] textoQuebrado = textoSemEspacos.split(" ");
        return Arrays.toString(textoQuebrado);
    }
}
