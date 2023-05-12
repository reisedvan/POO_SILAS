package aulas;

import aulas.model.Bola;

public class AulasPoo {
    
    public static void main(String[] args) {
        Bola a = new Bola();
        a.cor = "Laranja";
        a.material = "Borracha";
        a.tamanho = 30;

        Bola b = new Bola();
        b.cor = "Azul";
        b.material = "Plastico";
        b.tamanho = 5;

        exibirDadosDeBola(a);
        a.esvaziar();
        exibirDadosDeBola(a);
        a.encher();
        exibirDadosDeBola(a);

    }

    public static void exibirDadosDeBola(Bola bola) {
        System.out.print("A bola '" + bola.cor
                + "' é de " + bola.material
                + " e tem " + bola.tamanho + "cm de diametro. ");
        if (bola.vazia) {
            System.out.println("Ela está vazia!");
        } else {
            System.out.println("Ela está cheia!");
        }
    }

}
