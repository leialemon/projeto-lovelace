package controller;

import model.Questao;
import java.util.List;
import java.util.Scanner;

public class QuestaoController {
    public static boolean responderQuestaoAberta(Questao q) {
        Scanner entrada = new Scanner(System.in);
        String tentativa = entrada.nextLine();
        entrada.close();
        return q.corrigir(tentativa);
    }

    public static boolean responderQuestaoFechada(Questao q, List<String> alternativas){
        Scanner entrada = new Scanner(System.in);
        String resposta = "";
        boolean valida = false;
        do{
            String tentativa = entrada.next();
            switch (tentativa.toLowerCase()){
                case "a":
                    resposta = alternativas.get(0);
                    valida = true;
                    break;
                case "b":
                    resposta = alternativas.get(1);
                    valida = true;
                    break;
                case "c":
                    resposta = alternativas.get(2);
                    valida = true;
                    break;
                case "d":
                    resposta = alternativas.get(3);
                    valida = true;
                    break;
                default:
                System.out.println("Alternativa inválida! Por favor, tente novamente!");
            }
        } while(!valida);
        entrada.close();
        return q.corrigir(resposta);
    }
}
