package controller;

import repository.*;
import service.*;
import model.*;

public class MenuImpl implements Menu{
    Companion companionAtivo;
        
    RepositorioCompanion companions = new RepositorioCompanion();
    RepositorioModulo modulos = new RepositorioModulo();
    RepositorioTema temas = new RepositorioTema();
    RepositorioQuestoes questoes = new RepositorioQuestoes();

    CompanionService companionService = new CompanionServiceImpl(companions);
    ModuloService moduloService = new ModuloServiceImpl(modulos);
    QuestaoService questaoService = new QuestaoServiceImpl(questoes);
    
    public RepositorioCompanion getRepositorioCompanion(){
        return this.companions;
    }

    public RepositorioModulo getRepositorioModulo(){
        return this.modulos;
    }

    public RepositorioTema getRepositorioTema(){
        return this.temas;
    }

    public RepositorioQuestoes getRepositorioQuestoes(){
        return this.questoes;
    }

    public void setCompanionAtivo(Companion c){
        this.companionAtivo = c;
    }

    public void chamarMenus(){
        // menus genéricos para seleção de companion e modo
    }

    public void chamarMenuAluno(Companion companionAtivo){
        MenuAluno menuAluno = new MenuAluno(companionAtivo);
        menuAluno.mostrarMenuInicial();
    }

    public void chamarMenuAdmin(Companion companionAtivo){
        MenuAdmin menuAdmin = new MenuAdmin(companionAtivo);
        menuAdmin.mostrarMenuInicial();
    }
}
