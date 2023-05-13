package aulas.model;

public class Bola {

    private String cor;
    private String material;
    private double tamanho;
    private Bico bico;
    private boolean vazia;

    public String getMaterial() {
        return material;
    }

    public Bico getBico() {
        return bico;
    }

    public void setBico(Bico bico) {
        this.bico = bico;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isVazia() {
        return vazia;
    }

    // getter e setter :: isVazia
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        if (tamanho <= 0) {
            System.out.println("False Tamanho Invalido");
        } else {
            this.tamanho = tamanho;
        }
    }

    public void desgastar() {
        if (tamanho > 0) {
            tamanho = tamanho - (tamanho * 0.1);
        }
    }

    public void encher() {
        if (vazia == false) {
            System.out.println("Bola já está cheia");
        } else {
            vazia = false;
            System.out.println("A bola foi Cheia");
        }
    }

    public void esvaziar() {
        if (vazia == true) {
            System.out.println("Bola já está vazia");
        } else {
            vazia = true;
            System.out.println("A bola foi esvaziada");
        }
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
