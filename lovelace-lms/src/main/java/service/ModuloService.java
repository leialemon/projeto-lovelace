package service;

import model.Modulo;
import model.Tema;

public interface ModuloService extends Service<Modulo>{
    public Status adicionarTema(Modulo m, Tema t);
}
