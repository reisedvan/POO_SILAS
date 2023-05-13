package aulas;

import aulas.model.Bola;
import java.util.Scanner;

public class AulasPoo {
   static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        String cor;
        String material;
        double tamanho;
        
     
        Bola a = new Bola();
        a.setCor("Laranja");
        a.setMaterial("Borracha");
        a.setTamanho(30);
        
        Bola b = new Bola();
        b.setCor("Azul");
        b.setMaterial("Borracha");
        b.setTamanho(30);

        exibirDadosDeBola(a);
        exibirDadosDeBola(a);

    }

    public static void exibirDadosDeBola(Bola bola) {
        System.out.print("A bola '" + bola.getCor()
                + "' é de " + bola.getMaterial()
                + " e tem " + bola.getTamanho() + "cm de diametro. ");
        if (bola.isVazia()) {
            System.out.println("Ela está vazia!");
        } else {
            System.out.println("Ela está cheia!");
        }
    }

}
