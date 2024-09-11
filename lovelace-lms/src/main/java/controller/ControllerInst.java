package controller;

import model.Companion;
import model.Modulo;
import model.Questao;
import model.Tema;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;
import service.*;

import java.util.List;

public class ControllerInst {

    CompanionServiceInst companionService;
    ModuloService moduloService;
    TemaService temaService;
    QuestaoServiceInst questaoService;

    public ControllerInst (){
        RepositorioCompanion repositorioCompanion = new RepositorioCompanion();
        RepositorioModulo repositorioModulo = new RepositorioModulo();
        RepositorioTema repositorioTema = new RepositorioTema();
        RepositorioQuestoes repositorioQuestoes = new RepositorioQuestoes();
        this.companionService = new CompanionServiceInst(repositorioCompanion);
        this.questaoService = new QuestaoServiceInst(repositorioQuestoes);
        this.moduloService = new ModuloService(repositorioModulo);
        this.temaService = new TemaService(repositorioTema);
    }

    public Status criarCompanion(Companion c){
        if (c.getNome() == null){
            return Status.NOME_NULO;
        } else if (c.getSenha() == null) {
            return Status.SENHA_NULA;
        }
        return this.companionService.criar(c);
    }

    public List<Companion> getCompanions(){
        return this.companionService.getList();
    }

    public List<Modulo> getModulos(){
        return this.moduloService.getList();
    }

    public List<Tema> getTemas(){
        return this.temaService.getList();
    }

    public List<Questao> getQuestoes(){
        return this.questaoService.getList();
    }
}
