package service;

import model.Companion;

import java.util.List;

public abstract class CompanionServiceImpl extends ServiceImpl implements CompanionService {
    @Override
    public void adicionar(Companion c) {
        super.repoCompanion.adicionar(c);
    }

}
