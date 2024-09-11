package service;

import model.Modulo;
import model.Tema;
import repository.RepositorioModulo;

import java.util.List;

public class ModuloServiceImpl implements ModuloService{
    RepositorioModulo repositorioModulo;
    public ModuloServiceImpl(RepositorioModulo modulo){
        this.repositorioModulo = modulo;
    }

    @Override
    public Status criar(Modulo modulo) {
        return this.repositorioModulo.adicionar(modulo);
    }

    @Override
    public Status excluir(Modulo modulo) {
        return this.repositorioModulo.apagar(modulo);
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

    @Override
    public Status adicionarTema(Modulo m, Tema t) {
        m.addTema(t);
        return Status.TUDO_CERTO;
    }
}
