package view;

import controller.ValidadorDeEntradas;
import model.Companion;


public class MenuAdmin {
    Companion companionAtivo;

    public MenuAdmin(Companion companionAtivo){
        this.companionAtivo = companionAtivo;
    }
    // CONFERIR SENHA
    public void verificarAcesso() {
        System.out.println("### " + companionAtivo.getNome() + " - Modo administrador ###");
        if (!ValidadorDeEntradas.checarSenha(companionAtivo)) {
            System.out.println("Senha de administrador inválida");
            System.out.println("Encerrando o programa.");
            return;
        }
        System.out.println("acesso permitido");
    }

    public void mostrarMenuInicial(){
        // Criar Companion
        // Editar Companion
        // Criar módulo
        // Editar módulo
        // Criar Tema
        // Editar Tema
        // Criar Exercício
        // Editar Exercício
        // Criar Questão
        // Editar Questão
    }  
}
