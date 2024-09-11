package view;

import java.util.List;

import model.Exercicio;
import model.QuestaoImpl;

public class ExercicioView {
    public static void mostrarExercicio(Exercicio exercicio){
        List<QuestaoImpl> questoes = exercicio.getQuestoes();
        System.out.println("\n### Exercício ###\n");
        int i = 0;
        int acertos = 0;
        for (QuestaoImpl q : questoes){
            acertos += QuestaoView.mostrarQuestao(++i, q);
            System.out.println();
        }
        System.out.println("Resultado: Você acertou "+acertos+ " de "+ questoes.size()+ " questões.");
        System.out.println("(Pressione qualquer tecla para voltar ao menu anterior)");
        Menu.entrada.next();
    }
}
