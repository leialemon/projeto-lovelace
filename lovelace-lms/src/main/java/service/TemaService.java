package service;

import model.Tema;
import repository.RepositorioTema;

import java.util.List;

public class TemaService implements  Service<Tema>{
    RepositorioTema repositorioTema;
    public TemaService(RepositorioTema tema){
        this.repositorioTema = tema;
    }

    @Override
    public Status criar(Tema tema) {
        return this.repositorioTema.adicionar(tema);
    }

    @Override
    public void excluir(Tema tema) {

    }

    @Override
    public void editar(Tema tema) {

    }

    @Override
    public Tema mostrar(Tema tema) {
        return null;
    }

    @Override
    public List<Tema> getList() {
        return this.repositorioTema.getList();
    }
}
