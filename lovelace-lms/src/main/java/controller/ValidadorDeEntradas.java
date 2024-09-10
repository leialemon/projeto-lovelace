package controller;

import java.util.Scanner;

import model.Companion;

public class ValidadorDeEntradas {
    // Classe utilitária com métodos para validar entradas de usuário

    public static boolean checarSenha(Scanner entrada, Companion companion) {
        boolean senhaCorreta = false;
        boolean sair = false;
        do {
            System.out.println("Por favor, digite sua senha de administrador:");
            if (entrada.nextLine().equals(companion.getSenha())) {
                senhaCorreta = true;
                return senhaCorreta;
            }
            System.out.println("Senha incorreta! Digite 1 para tentar novamente ou 2 para sair do programa");
            if (entrada.nextInt() == 2) {
                sair = true;
                break;
            }
        } while (!senhaCorreta || sair);

        return senhaCorreta;
    }

    public static int validarOpcoes(int primeira, int ultima) {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        int opcao = 0;
        String opt;
        do {
            try {
                opcao = Integer.parseInt(entrada.next());
                if (opcao >= primeira && opcao <= ultima) {
                    valido = true;
                    entrada.close();
                    return opcao;
                }
            } catch (IllegalArgumentException e) {
                valido = false;
                System.err.println("Erro! Por favor, escolha uma opção válida!");
            }

        } while (!valido);
        return opcao;
    }
}
