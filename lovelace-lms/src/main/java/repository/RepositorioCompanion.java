package repository;

import model.Companion;
import model.Modulo;

import java.util.List;

public class RepositorioCompanion implements Repositorio{

    List<Companion> companions;

    public List<Companion> getCompanions(){
        return this.companions;
    };
}
