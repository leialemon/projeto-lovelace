package view;

import controller.ValidadorDeEntradas;
import model.*;

public class MenuAluno extends Menu {
    Companion companionAtivo;

    public MenuAluno (Companion c){
        this.companionAtivo = c;
    }

    public void mostrarMenuInicial(){
        if (companionAtivo.getAvatar() != null){
            System.out.println(companionAtivo.getAvatar());
        } else {
            System.out.println("Olá! Eu sou "+companionAtivo.getNome()+", seu companion de aprendizado!");
        }
        System.out.println("Se quiser me chamar ao iniciar o programa, utilize a flag '" + companionAtivo.getFlag() + "' na linha de comando ao executar o lovelace:");
        System.out.println("java Lovelace " + companionAtivo.getFlag());
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do Companion:");
        CompanionView.mostrarModulos(companionAtivo);
        int opcao = ValidadorDeEntradas.validarOpcoes(0, companionAtivo.getModulos().size());
        if (opcao == 0){
            super.chamarMenus();
        } else this.mostrarModulo(companionAtivo.getModulos().get(opcao-1));
        //adicionar opção de apenas fazer exercícios?
    }

    public void mostrarModulo(Modulo modulo){
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do Companion:");
        ModuloView.mostrarTemas(modulo);
        int menuAnterior = (modulo.getTemas().size()+1);
        int opcao = ValidadorDeEntradas.validarOpcoes(0, menuAnterior);
        if (opcao == 0){
            super.chamarMenus();
        } else if (opcao == menuAnterior){
            this.mostrarMenuInicial();
        } else this.mostrarTema(modulo.getTemas().get(opcao-1));
    }

    public void mostrarTema(Tema tema){
        TemaView.mostrarTema(tema);
        this.mostrarModulo(tema.getModulo());
    }
}
