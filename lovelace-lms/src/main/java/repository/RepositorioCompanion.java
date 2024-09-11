package repository;

import model.Companion;
import model.Modulo;
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
        if (this.buscar(companion) == Status.TUDO_CERTO){
            return Status.JA_EXISTE;
        }
        this.bancoDeCompanions.add(companion);
        this.flags.add(companion.getFlag());
        return Status.TUDO_CERTO;
    }

    @Override
    public Status buscar(Companion companion){
        if (companion == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return Status.INSTANCIA_NULA;
        }        
        for (Companion c : this.bancoDeCompanions){
            if (companion.equals(c)) return Status.TUDO_CERTO;
        }
        return Status.NAO_EXISTE;
    }

    @Override
    public Status apagar(Companion companion){
        for (Companion c : this.bancoDeCompanions){
            if(companion.equals(c)){
                this.flags.remove(c.getFlag());
                this.bancoDeCompanions.remove(c);
                return Status.TUDO_CERTO;
            }
        }
        return Status.NAO_EXISTE;
    }
}
