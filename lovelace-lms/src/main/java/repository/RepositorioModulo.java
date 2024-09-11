package repository;

import model.Modulo;
import model.Questao;
import service.Status;

import java.util.*;

public class RepositorioModulo implements Repositorio<Modulo>{
    List<Modulo> bancoDeModulos = new ArrayList<>();

    public List<Modulo> getList(){
        return this.bancoDeModulos;
    }

    @Override
    public Status adicionar(Modulo modulo){
        if (this.buscar(modulo) == Status.TUDO_CERTO){
            return Status.JA_EXISTE;
        }
        this.bancoDeModulos.add(modulo);
        return Status.TUDO_CERTO;
    }

    @Override
    public Status buscar(Modulo modulo){
        if (modulo == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return Status.INSTANCIA_NULA;
        }        
        for (Modulo m : bancoDeModulos){
            if (modulo.equals(m)) return Status.TUDO_CERTO;
        }
        return Status.NAO_EXISTE;
    }

    @Override
    public Status apagar(Modulo modulo){
        for (Modulo m : this.bancoDeModulos){
            if(modulo.equals(m)){
                this.bancoDeModulos.remove(m);
                return Status.TUDO_CERTO;
            }
        }
        return Status.NAO_EXISTE;
    }
}
