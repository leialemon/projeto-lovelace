package model;

public class Concentracao {
    Unidades unidade1;
    Unidades unidade2;
    int numero;

    public Unidades getUnidade1(){
        return this.unidade1;
    }

    public Unidades getUnidade2(){
        return this.unidade2;
    }

    public int getNumero(){
        return this.numero;
    }

    public String toString(){
        return this.getNumero() + " " + this.getUnidade1() + "/" + this.getUnidade2();
    }
}
