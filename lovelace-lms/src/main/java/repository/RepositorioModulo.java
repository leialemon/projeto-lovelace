package repository;

import model.Modulo;

import java.util.List;

public class RepositorioModulo implements Repositorio{
    List<Modulo> modulos;

    public List<Modulo> getModulos(){
        return this.modulos;
    }
}
