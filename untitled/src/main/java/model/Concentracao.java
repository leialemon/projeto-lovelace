package model;

public class Concentracao {
    String unidade1;
    String unidade2;
    int numero;

    public String getUnidade1(){
        return this.unidade1;
    }

    public String getUnidade2(){
        return this.unidade2;
    }

    public int getNumero(){
        return this.numero;
    }

    public String toString(){
        return this.getNumero() + " " + this.getUnidade1() + "/" + this.getUnidade2();
    }
}
