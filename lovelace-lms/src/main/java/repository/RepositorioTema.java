package repository;

import model.Questao;
import model.Tema;
import service.Status;

import java.util.List;
import java.util.ArrayList;;

public class RepositorioTema implements Repositorio<Tema> {

    private List<Tema> bancoDeTemas = new ArrayList<>();

    @Override
    public List<Tema> getList(){
        return this.bancoDeTemas;
    }

    @Override
    public Status adicionar(Tema t) {
        if (this.buscar(t) == Status.TUDO_CERTO){
            return Status.JA_EXISTE;
        }
        this.bancoDeTemas.add(t);
        return Status.TUDO_CERTO;
    }

    @Override
    public Status buscar(Tema t) {
        if (t == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return Status.INSTANCIA_NULA;
        }        
        for (Tema tema : this.bancoDeTemas){
            if (t.equals(tema)) return Status.TUDO_CERTO;
        }
        return Status.NAO_EXISTE;
    }

    @Override
    public Status apagar(Tema tema) {
        for (Tema t : this.bancoDeTemas){
            if(t.equals(tema)){
                this.bancoDeTemas.remove(t);
                return Status.TUDO_CERTO;
            }
        }
        return Status.NAO_EXISTE;
    }
    
}
