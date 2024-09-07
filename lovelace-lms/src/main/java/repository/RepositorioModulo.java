package repository;

import model.Modulo;

import java.util.List;

public class RepositorioModulo implements Repositorio<Modulo>{
    List<Modulo> bancoDeModulos;

    public List<Modulo> getList(){
        return this.bancoDeModulos;
    }

    @Override
    public void adicionar(Modulo modulo){}

    @Override
    public boolean buscar(Modulo modulo){
        if (modulo == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return false;
        }        
        for (Modulo m : bancoDeModulos){
            if (modulo.equals(m)) return true;
        }
        return false;  
    }

    @Override
    public void editar (Modulo modulo){}

    @Override
    public void apagar(Modulo modulo){}
}
