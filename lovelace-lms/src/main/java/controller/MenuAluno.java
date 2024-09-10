package controller;

import model.*;
import view.*;

public class MenuAluno extends MenuImpl{
    
    public MenuAluno(Companion companionAtivo){
        this.companionAtivo = companionAtivo;
    }

    public void mostrarMenuInicial(){
        System.out.println(companionAtivo.getAvatar());
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do Companion:\n");
        CompanionView.mostrarModulos(companionAtivo);
        int opcao = ValidadorDeEntradas.validarOpcoes(0, companionAtivo.getModulos().size());
        if (opcao == 0){
            return;
        } else this.mostrarModulo(companionAtivo.getModulos().get(opcao-1));
        //adicionar opção de apenas fazer exercícios?
    }

    public void mostrarModulo(Modulo modulo){
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do Companion:\n");
        ModuloView.mostrarTemas(modulo);
        int menuAnterior = (modulo.getTemas().size()+1);
        int opcao = ValidadorDeEntradas.validarOpcoes(0, menuAnterior);
        if (opcao == 0){
            return;
        } else if (opcao == 1){
            this.mostrarMenuInicial();
        } else this.mostrarTema(modulo.getTemas().get(opcao-1));
    }

    public void mostrarTema(Tema tema){
        TemaView.mostrarTema(tema);
        this.mostrarModulo(tema.getModulo());
    }
}
