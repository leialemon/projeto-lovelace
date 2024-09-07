package service;

import model.Questao;
import repository.Repositorio;
import repository.RepositorioQuestoes;

public class QuestaoService implements Service<Questao>{
    private Repositorio<Questao> repositorio = new RepositorioQuestoes();
    public void setRepositorio(Repositorio<Questao> repositorio){
    }
    public void criar(Questao q){};
    public void excluir(Questao q){};
    public void editar(Questao q){};
    public void mostrar(Questao q){};
}
