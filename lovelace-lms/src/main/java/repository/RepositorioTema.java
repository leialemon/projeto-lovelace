package repository;

import model.Tema;
import java.util.List;
import java.util.ArrayList;;

public class RepositorioTema implements Repositorio<Tema> {

    private List<Tema> bancoDeTemas = new ArrayList<>();

    @Override
    public List<Tema> getList(){
        return this.bancoDeTemas;
    }

    @Override
    public void adicionar(Tema t) {
        this.bancoDeTemas.add(t);
    }

    @Override
    public boolean buscar(Tema t) {
      if (t == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return false;
        }        
        for (Tema tema : this.bancoDeTemas){
            if (t.equals(tema)) return true;
        }
        return false;  
    }

    @Override
    public void editar(Tema t) {
        
    }

    @Override
    public void apagar(Tema t) {
       
    }
    
}
