package service;

import model.Questao;
import repository.RepositorioQuestoes;

public class QuestaoServiceImpl extends ServiceImpl<Questao> implements QuestaoService{
    
    public QuestaoServiceImpl(RepositorioQuestoes repositorio){
        super.setRepositorio(repositorio);
    }

    public void criar(Questao q){
        // NÃO DEIXAR CRIAR QUESTOES COM MAIS DE 4 ALTERNATIVAS
        super.criar(bancoQuestoes, q);
    };

    public void excluir(Questao q){
        super.excluir(bancoQuestoes, q);
    };

    public void editar(Questao q){
        super.editar(bancoQuestoes, q);
    };

    public void mostrar(Questao q){
        super.mostrar(bancoQuestoes, q);
    };
}
