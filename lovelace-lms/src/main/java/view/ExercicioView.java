package view;

import java.util.List;

import controller.ValidadorDeEntradas;
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

    public static Exercicio criarExercicio(){
        System.out.println("\n#########");
        System.out.println("Criação de Exercícios");
        Exercicio exercicio = new Exercicio();
        boolean continuar = true;
        do {
            System.out.println("\nSelecione uma das opções:");
            System.out.println("1. Criar questão aberta");
            System.out.println("2. Criar questão fechada");
            System.out.println("3. Voltar ao menu principal");
            int opcao = ValidadorDeEntradas.validarOpcoes(1, 3);
            switch (opcao) {
                case 1:
                    exercicio.addQuestao(QuestaoView.criarQuestaoAberta());
                    break;
                case 2:
                    exercicio.addQuestao(QuestaoView.criarQuestaoFechada());
                    break;
                case 3:
                    continuar = false;
            }
        }while (continuar);

        return exercicio;
    }
}
