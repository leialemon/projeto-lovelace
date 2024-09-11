package service;

import model.Exercicio;
import model.Tema;

public interface TemaService extends Service<Tema>{
    public Status adicionarExercicio(Tema t, Exercicio e);
}
