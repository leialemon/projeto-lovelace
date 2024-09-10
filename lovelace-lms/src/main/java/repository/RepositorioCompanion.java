package repository;

import model.Companion;
import service.Status;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCompanion implements Repositorio<Companion>{

    List<Companion> bancoDeCompanions = new ArrayList<>();
    List<String> flags = new ArrayList<>();

    @Override
    public List<Companion> getList(){
        return this.bancoDeCompanions;
    };

    public List<String> getFlags(){
        return this.flags;
    }

    @Override
    public Status adicionar(Companion companion){
        if (buscar(companion)){
            return Status.JA_EXISTE;
        }
        bancoDeCompanions.add(companion);
        flags.add(companion.getFlag());
        return Status.TUDO_CERTO;
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
