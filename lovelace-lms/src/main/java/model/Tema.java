package model;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    String nome;
    List<String> texto = new ArrayList<>();
    Exercicio exercicio;

    public Tema(String nome){
        this.nome = nome;
    }

    public void addParagrafo(String texto){
        this.texto.add(texto);
    }

    public void addExercicio(Exercicio exercicio){
        this.exercicio = exercicio;
    }

    public String getNome(){
        return this.nome;
    }

}
