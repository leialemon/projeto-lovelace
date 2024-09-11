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
        this.mostrarMenuInicial();
    }

    public void mostrarMenuInicial(){
        // Editar Companion
        // Editar módulo
        // Excluir módulo do companion
        // Excluir Companion
    }  
}
