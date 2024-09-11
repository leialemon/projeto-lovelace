package service;

import model.Exercicio;
import model.Tema;
import repository.RepositorioTema;

import java.util.List;

public class TemaServiceImpl implements  TemaService{
    RepositorioTema repositorioTema;
    public TemaServiceImpl(RepositorioTema tema){
        this.repositorioTema = tema;
    }

    @Override
    public Status criar(Tema tema) {
        return this.repositorioTema.adicionar(tema);
    }

    @Override
    public Status excluir(Tema tema) {
        return this.repositorioTema.apagar(tema);
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

    @Override
    public Status adicionarExercicio(Tema t, Exercicio e) {
        t.addExercicio(e);
        return Status.TUDO_CERTO;
    }
}
