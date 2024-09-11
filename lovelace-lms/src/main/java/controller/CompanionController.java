package controller;

import model.Companion;
import service.CompanionServiceImpl;
import service.Status;


public class CompanionController {
    public static void criarCompanion(Companion c, CompanionServiceImpl service){
        if (service.criar(c) != Status.TUDO_CERTO){

        };
    }
}
