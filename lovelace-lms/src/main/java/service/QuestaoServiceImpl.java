package service;

import model.Questao;
import repository.RepositorioQuestoes;

import java.util.List;

public class QuestaoServiceImpl implements QuestaoService{
    RepositorioQuestoes repositorioQuestoes;
    public QuestaoServiceImpl(RepositorioQuestoes repositorioQuestoes){
        this.repositorioQuestoes = repositorioQuestoes;
    }

    @Override
    public Status criar(Questao questao) {
        return null;
    }

    @Override
    public Status excluir(Questao questao) {
        return this.repositorioQuestoes.apagar(questao);
    }

    @Override
    public void editar(Questao questao) {

    }

    @Override
    public Questao mostrar(Questao questao) {
        return null;
    }

    @Override
    public List<Questao> getList() {
        return this.repositorioQuestoes.getList();
    }
}
