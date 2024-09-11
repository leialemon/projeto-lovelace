package controller;

import model.Exercicio;
import model.Tema;
import service.Status;

public interface TemaController extends Controller<Tema>{
    public Status adicionarExercicio(Tema tema, Exercicio exercicio);
}
