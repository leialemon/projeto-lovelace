package service;

import model.Companion;

public class CompanionServiceImpl extends ServiceImpl<Companion> implements CompanionService {

    @Override
    public Status criar(Companion c){
        if (c.getNome() == null){
            return Status.NOME_NULO;
        }
        if (c.getSenha() == null){
            return Status.SENHA_NULA;
        }
        return super.repoCompanion.adicionar(c);
    }

    @Override
    public void excluir(Companion c) {}

    @Override
    public void editar(Companion c) {}

    @Override
    public Companion mostrar(Companion c) {
        return null;}
}
