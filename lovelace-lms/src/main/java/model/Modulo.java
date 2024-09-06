package model;

import java.util.List;

public class Modulo {
    String nome;
    List<Tema> temas;
    public Modulo(String nome){
        this.nome = nome;
    }

    public void addTema(Tema tema){
        temas.add(tema);
    }

    public List<Tema> getTemas(){
        return this.temas;
    }
}
