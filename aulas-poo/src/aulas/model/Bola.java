package aulas.model;

public class Bola {
    
    public String cor;
    public String material;
    public double tamanho;

    public boolean vazia;

    public void encher() {
        vazia = false;
    }

    public void esvaziar() {
        vazia = true;
    }

    public void quicar() {
        System.out.print(".");
        System.out.print("°");
        System.out.print(".");
        System.out.print("°");
        System.out.print(".");
        System.out.print("°");
        System.out.print(".");
        System.out.print("°");
        System.out.print(".");
        System.out.print("°");
    }

    public void rolar() {
        System.out.print(".");
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(".");
    }

}
