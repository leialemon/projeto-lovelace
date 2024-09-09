package view;

import java.util.List;

import model.Exercicio;
import model.QuestaoImpl;

public class ExercicioView {
    public static void mostrarExercicio(Exercicio exercicio){
        List<QuestaoImpl> questoes = exercicio.getQuestoes();
        System.out.println("\n### Exercício ###\n");
        int i = 0;
        for (QuestaoImpl q : questoes){
            QuestaoView.mostrarQuestao(i++, q);
            System.out.println();
        }
    }
}
