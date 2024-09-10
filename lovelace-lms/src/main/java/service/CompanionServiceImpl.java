package service;

import model.Companion;

import java.util.List;

public abstract class CompanionServiceImpl extends ServiceImpl<Companion> implements CompanionService {
    @Override
    public void adicionar(Companion c) {
        super.repoCompanion.adicionar(c);
    }

    @Override
    public void criar(Companion c){}

    @Override
    public void excluir(Companion c) {}

    @Override
    public void editar(Companion c) {}

    @Override
    public Companion mostrar(Companion c) {
        return null;}
}
