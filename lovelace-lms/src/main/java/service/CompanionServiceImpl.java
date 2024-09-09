package service;

import model.Companion;
import repository.RepositorioCompanion;


public class CompanionServiceImpl extends ServiceImpl<Companion> implements CompanionService{
    
    public CompanionServiceImpl(RepositorioCompanion repo){
        super.setRepositorio(repo);
    }

    public void escolherAvatar(Companion c, String avatar){
        c.setAvatar(avatar);
    }

    public void criar(Companion c){
        super.criar(bancoCompanions, c);
    };

    public void excluir(Companion c){
        super.excluir(bancoCompanions, c);
    };

    public void editar(Companion c){
        super.editar(bancoCompanions, c);
    };

    public void mostrar(Companion c){
        super.mostrar(bancoCompanions, c);
    };
}

