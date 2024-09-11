package controller;

import model.Modulo;
import model.Tema;
import service.Status;

public interface ModuloController extends Controller<Modulo>{
    public Status adicionarTema(Modulo m, Tema t);
}
