package model;

import javax.print.DocFlavor;
import java.util.HashMap;

public class Medicamento {
    String nome;
    int ID;
    HashMap<Animais, String> dosagem;

    public Medicamento(String nome){
        this.nome = nome;
    }

    public void setID(int id){
        this.ID = id;
    }
}
