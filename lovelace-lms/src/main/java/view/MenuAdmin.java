package view;

import controller.*;
import model.Companion;

import java.util.Scanner;


public class MenuAdmin {
    Companion companionAtivo;
    CompanionController companionController;
    ModuloController moduloController;
    TemaController temaController;
    QuestaoController questaoController;

    public MenuAdmin(Companion companionAtivo, CompanionController companionController, ModuloController moduloController, TemaController temaController, QuestaoController questaoController){
        this.companionAtivo = companionAtivo;
        this.companionController = companionController;
        this.moduloController = moduloController;
        this.temaController = temaController;
        this.questaoController = questaoController;
    }

    public void setCompanionAtivo(Companion c){
        this.companionAtivo = c;
    }

    // CONFERIR SENHA
    public void verificarAcesso() {
        if (this.companionAtivo == null){
            System.out.println("Nenhum companion válido selecionado!");
            return;
        }
        System.out.println("### " + companionAtivo.getNome() + " - Modo administrador ###");
        if (!ValidadorDeEntradas.checarSenha(companionAtivo)) {
            System.out.println("Senha de administrador inválida");
            System.out.println("Encerrando o programa.");
            return;
        }
        this.mostrarMenuInicial();
    }

    public void mostrarMenuInicial(){
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do Companion:");
        System.out.println("1. Editar Companion");
        System.out.println("2. Editar módulo");
        System.out.println("3. Excluir Companion");
        int opcao = ValidadorDeEntradas.validarOpcoes(0,3);
        switch (opcao){
            case 0:
                return;
            case 1:
                this.editarCompanion();
                break;
            case 2:
                this.editarModulo();
                break;
            case 3:
                this.excluirCompanion();
                break;
        }
    }

    public void excluirCompanion(){
        System.out.println("Para confirmar a exclusão do companion, digite a senha novamente:");
        if (ValidadorDeEntradas.checarSenha(companionAtivo)){
            System.out.println("Senha confirmada.");
            System.out.println("Excluindo companion "+companionAtivo.getNome());
            this.companionController.apagar(companionAtivo);
            this.setCompanionAtivo(null);
            return;
        } else {
            System.out.println("Senha não confirmada. Voltando ao menu anterior");
            this.mostrarMenuInicial();
        }
    }

    public void editarModulo(){
        System.out.println("Funcionalidade em construção.");
    }

    public void editarCompanion(){
        System.out.println("Funcionalidade em construção.");
    }
}
