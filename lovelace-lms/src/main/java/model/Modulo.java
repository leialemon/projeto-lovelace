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

    public String getNome(){
        return this.nome;
    }

    public void addTema(Tema tema){
        temas.add(tema);
        tema.setModulo(this);
    }

    public List<Tema> getTemas(){
        return this.temas;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Modulo)) return false;
        Modulo m = (Modulo) obj;
        if (this.getNome().equals(m.getNome())) return true;
        return false;
    }
}
