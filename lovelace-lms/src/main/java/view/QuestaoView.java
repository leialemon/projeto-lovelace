package view;

import java.util.*;

import controller.QuestaoControllerImpl;
import model.QuestaoImpl;
import model.QuestaoAberta;
import model.QuestaoFechada;

public class QuestaoView {
    
    public static int mostrarQuestao(int numero, QuestaoImpl questao){
        if(questao instanceof QuestaoAberta){
            QuestaoAberta q = (QuestaoAberta) questao;
            return mostrarQuestaoAberta(numero, q);
        } else if (questao instanceof QuestaoFechada){
            QuestaoFechada q = (QuestaoFechada) questao;
            return mostrarQuestaoFechada(numero, q);
        }
        return 0;
    }

    public static int mostrarQuestaoAberta(int numero, QuestaoAberta questao){
        System.out.println(numero+". "+questao.getEnunciado());
        System.out.println();
        if (QuestaoControllerImpl.responderQuestaoAberta(questao)){
            System.out.println("Parabéns, você acertou!");
            return 1;
        } else {
            System.out.println("Que pena, você errou!");
            System.out.println("Resposta correta: "+ questao.getResposta());
            return 0;
        }
    }

    public static int mostrarQuestaoFechada(int numero, QuestaoFechada questao){
        // Este método apresenta ao usuário as alternativas em ordem aleatória;
        System.out.println(numero+". "+questao.getEnunciado());
        System.out.println("(Digite a letra referente à alternativa que você escolheu)\n");
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
        alternativas.remove(c3);
        String d = alternativas.get(0);
        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        System.out.println("d) "+d);
        List<String> questoesApresentadas = new ArrayList<>(Arrays.asList(a, b, c, d));

        if(QuestaoControllerImpl.responderQuestaoFechada(questao, questoesApresentadas)){
            System.out.println("Parabéns, você acertou!");
            return 1;
        }else {
            System.out.println("Que pena, você errou!");
            System.out.println("Resposta correta: "+ questao.getResposta());
            return 0;
        }
    }

    public static QuestaoAberta criarQuestaoAberta(){
        boolean valido = false;
        String enunciado = null;
        String resposta = null;
        Scanner entrada = Menu.entrada;
        do{System.out.println("\nDigite o enunciado da questão:");
            enunciado = entrada.nextLine();
            System.out.println("\nDigite a resposta da questção:");
            resposta = entrada.nextLine();
            if (enunciado != null && resposta != null){
                valido = true;
            } else {
                System.out.println("Algo deu errado, tente novamente.");
            }
        } while (!valido);
        QuestaoAberta questao = new QuestaoAberta(enunciado, resposta);
        return questao;
    }

    public static QuestaoFechada criarQuestaoFechada(){
        String enunciado = null;
        String resposta = null;
        Scanner entrada = Menu.entrada;
        boolean valida = false;
        System.out.println("Crie uma questão fechada com 4 alternativas. O programa irá mostrar as alternativas em ordem aleatória.");
        do{
            System.out.println("\nDigite o enunciado da questão:");
            enunciado = entrada.nextLine();
            System.out.println("\nDigite a resposta da questão:");
            resposta = entrada.nextLine();
            if (enunciado != null && resposta != null){
                valida = true;
            } else {
                System.out.println("Algo deu errado, tente novamente.");
            }
        }while (!valida);
        QuestaoFechada questao = new QuestaoFechada(enunciado);
        questao.setResposta(resposta);
        System.out.println("\nDigite uma das alternativas incorretas:");
        String alternativa1 = entrada.nextLine();
        System.out.println("\nDigite mais uma das alternativas incorretas:");
        String alternativa2 = entrada.nextLine();
        System.out.println("\nDigite a última alternativa incorreta:");
        String alternativa3 = entrada.nextLine();
        questao.addAlternativas(alternativa1);
        questao.addAlternativas(alternativa2);
        questao.addAlternativas(alternativa3);
        return questao;
    }
}
