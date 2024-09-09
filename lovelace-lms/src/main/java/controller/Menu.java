package controller;

import model.Companion;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;

public interface Menu {
    public RepositorioCompanion getRepositorioCompanion();
    public RepositorioModulo getRepositorioModulo();
    public RepositorioTema getRepositorioTema();
    public RepositorioQuestoes getRepositorioQuestoes();
    public void chamarMenus();
    public void chamarMenuAdmin(Companion companionAtivo);
    public void chamarMenuAluno(Companion companionAtivo);
} 
