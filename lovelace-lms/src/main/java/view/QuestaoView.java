package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import controller.QuestaoController;
import model.QuestaoImpl;
import model.QuestaoAberta;
import model.QuestaoFechada;

public class QuestaoView {
    
    public static void mostrarQuestao(int numero, QuestaoImpl questao){
        if(questao instanceof QuestaoAberta){
            QuestaoAberta q = (QuestaoAberta) questao;
            mostrarQuestaoAberta(numero, q);
        } else if (questao instanceof QuestaoFechada){
            QuestaoFechada q = (QuestaoFechada) questao;
            mostrarQuestaoFechada(numero, q);
        }
    }

    public static void mostrarQuestaoAberta(int numero, QuestaoAberta questao){
        System.out.println(numero+". "+questao.getEnunciado());
        System.out.println();
        if (QuestaoController.responderQuestaoAberta(questao)){
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Que pena, você errou!");
            System.out.println("Resposta correta: "+ questao.getResposta());
        }
    }

    public static void mostrarQuestaoFechada(int numero, QuestaoFechada questao){
        // Este método apresenta ao usuário as alternativas em ordem aleatória;
        System.out.println(numero+". "+questao.getEnunciado());
        System.out.println("\n(Digite a letra referente à alternativa que você escolheu)\n");
        List<String> alternativas = questao.getAlternativas();
        alternativas.add(questao.getResposta());
        Random rand = new Random();
        int a1 = rand.nextInt(alternativas.size());
        String a = alternativas.get(a1);
        alternativas.remove(a1);
        int b2 = rand.nextInt(alternativas.size());
        String b = alternativas.get(b2);
        alternativas.remove(b2);
        int c3 = rand.nextInt(alternativas.size());
        String c = alternativas.get(c3);
        String d = alternativas.get(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        List<String> questoesApresentadas = new ArrayList<>(Arrays.asList(a, b, c, d));
        if(QuestaoController.responderQuestaoFechada(questao, questoesApresentadas)){
            System.out.println("Parabéns, você acertou!");
        }else {
            System.out.println("Que pena, você errou!");
            System.out.println("Resposta correta: "+ questao.getResposta());
        }
    }
}
