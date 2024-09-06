package repository;

import model.Companion;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCompanion implements Repositorio<Companion>{

    List<Companion> companions = new ArrayList<>();
    List<String> flags = new ArrayList<>();

    public List<Companion> getCompanions(){
        return this.companions;
    };

    public void adicionar(Companion companion){
        companions.add(companion);
        flags.add(companion.getFlag());
    }
    public void buscar(Companion companion){}
    public void editar (Companion companion){}
    public void apagar(Companion companion){}
}
