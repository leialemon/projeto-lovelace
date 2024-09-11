package service;

import model.Modulo;
import repository.RepositorioModulo;

import java.util.List;

public class ModuloService implements Service<Modulo>{
    RepositorioModulo repositorioModulo;
    public ModuloService(RepositorioModulo modulo){
        this.repositorioModulo = modulo;
    }

    @Override
    public Status criar(Modulo modulo) {
        return this.repositorioModulo.adicionar(modulo);
    }

    @Override
    public void excluir(Modulo modulo) {

    }

    @Override
    public void editar(Modulo modulo) {

    }

    @Override
    public Modulo mostrar(Modulo modulo) {
        return null;
    }

    @Override
    public List<Modulo> getList() {
        return this.repositorioModulo.getList();
    }
}
