package service;

import model.Companion;
import model.Modulo;

public interface CompanionService extends Service<Companion>{
    public Status adicionarModulo(Modulo m, Companion c);
}
