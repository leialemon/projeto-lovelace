package model;

import java.util.ArrayList;
import java.util.List;


public class Tema {
    String nome;
    List<String> texto = new ArrayList<>();
    Exercicio exercicio;
    Modulo modulo;

    public Tema(String nome){
        this.nome = nome;
    }

    public void addParagrafo(String texto){
        String regex = "[§]";
        String[] textoSplit = texto.split(regex);
        for (String t : textoSplit){
            this.texto.add(t);
        }
    }

    public void addExercicio(Exercicio exercicio){
        this.exercicio = exercicio;
    }

    public String getNome(){
        return this.nome;
    }

    public List<String> getTexto(){
        return this.texto;
    }

    public Exercicio getExercicio(){
        return this.exercicio;
    }

    public void setModulo(Modulo m){
        this.modulo = m;
    }

    public Modulo getModulo(){
        return this.modulo;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Tema)) return false;
        Tema t = (Tema) obj;
        if (this.getNome().equals(t.getNome())) return true;
        return false;
    }

}
