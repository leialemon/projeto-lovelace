package controller;

import model.Companion;
import service.CompanionServiceInst;
import service.Status;


public class CompanionController {
    public static void criarCompanion(Companion c, CompanionServiceInst service){
        if (service.criar(c) != Status.TUDO_CERTO){

        };
    }
}
