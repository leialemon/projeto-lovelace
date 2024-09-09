package controller;

import model.Companion;

public class MenuAluno extends MenuImpl{
    Companion companionAtivo;
    public MenuAluno(Companion companionAtivo){
        this.companionAtivo = companionAtivo;
    }

    public void mostrarMenuInicial(){
        System.out.println(companionAtivo.getAvatar());

    }
}
