package controller;

import java.util.Scanner;

import model.Companion;

public class ValidadorDeEntradas {
    // Classe utilitária com métodos para validar entradas de usuário

    public static boolean checarSenha(Scanner entrada, Companion companion){
        boolean senhaCorreta = false;
        boolean sair = false;
        do{
            System.out.println("Por favor, digite sua senha de administrador:");
            if (entrada.nextLine().equals(companion.getSenha())){
                senhaCorreta = true;
                return senhaCorreta;
            }
            System.out.println("Senha incorreta! Digite 1 para tentar novamente ou 2 para sair do programa");
            if (entrada.nextInt() == 2){
                sair = true;
                break;
            }
        }while (!senhaCorreta || sair);

        return senhaCorreta;
    }
}
