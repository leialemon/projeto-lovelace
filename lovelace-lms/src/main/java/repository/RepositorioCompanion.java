package repository;

import model.Companion;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCompanion implements Repositorio<Companion>{

    List<Companion> bancoDeCompanions = new ArrayList<>();
    List<String> flags = new ArrayList<>();

    @Override
    public List<Companion> getList(){
        return this.bancoDeCompanions;
    };

    @Override
    public void adicionar(Companion companion){
        bancoDeCompanions.add(companion);
        flags.add(companion.getFlag());
    }

    @Override
    public boolean buscar(Companion companion){
        if (companion == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return false;
        }        
        for (Companion c : bancoDeCompanions){
            if (companion.equals(c)) return true;
        }
        return false;    
    }

    @Override
    public void editar (Companion companion){
       

    }

    @Override
    public void apagar(Companion companion){
        for (Companion c : bancoDeCompanions){
            if (companion.equals(c)){
                bancoDeCompanions.remove(c);
            }
        }

    }
}
