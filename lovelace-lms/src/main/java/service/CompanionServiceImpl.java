package service;

import model.Companion;
import model.Modulo;
import repository.RepositorioCompanion;

import java.util.List;

public class CompanionServiceImpl implements CompanionService {
    RepositorioCompanion repositorioCompanion;

    public CompanionServiceImpl(RepositorioCompanion repositorioCompanion){
        this.repositorioCompanion = repositorioCompanion;
    }
    @Override
    public Status criar(Companion c){
        return this.repositorioCompanion.adicionar(c);
    }

    @Override
    public Status excluir(Companion c) {
        return this.repositorioCompanion.apagar(c);
    }

    @Override
    public void editar(Companion c) {}

    @Override
    public Companion mostrar(Companion c) {
        return null;}

    @Override
    public List<Companion> getList() {
        return this.repositorioCompanion.getList();
    }

    @Override
    public Status adicionarModulo(Modulo m, Companion c) {
        if (m == null){
            return Status.INSTANCIA_NULA;
        }
        for (Modulo modulo : c.getModulos()){
            if (m.equals(modulo)){
                return Status.JA_EXISTE;
            }
        }
        c.addModulo(m);
        return Status.TUDO_CERTO;
    }
}
