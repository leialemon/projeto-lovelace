package controller;

import model.Companion;
import model.Modulo;
import service.Status;

public interface CompanionController extends Controller<Companion> {
    public Status adicionarModulo(Modulo m, Companion c);
}
