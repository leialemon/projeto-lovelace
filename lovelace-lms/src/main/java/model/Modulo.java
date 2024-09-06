package model;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    String nome;
    List<Tema> temas;
    public Modulo(String nome){
        this.nome = nome;
        temas = new ArrayList<>();
    }

    public void addTema(Tema tema){
        temas.add(tema);
    }

    public List<Tema> getTemas(){
        return this.temas;
    }
}
