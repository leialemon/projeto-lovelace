package repository;

import model.Modulo;

import java.util.List;

public class RepositorioModulo extends RepositorioImpl<Modulo>{
    List<Modulo> modulos;

    public List<Modulo> getModulos(){
        return this.modulos;
    }
    public void adicionar(Modulo modulo){}
    public void buscar(Modulo modulo){}
    public void editar (Modulo modulo){}
    public void apagar(Modulo modulo){}
}
