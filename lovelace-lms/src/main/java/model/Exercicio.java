package model;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    List<QuestaoImpl> questoes = new ArrayList<>();

// Overloading do método addQuestao permite adicionar questões ao exercício individualmente ou em grupo
public void addQuestao(QuestaoImpl questao){
    this.questoes.add(questao);
}

public void addQuestao(List<QuestaoImpl> questoes){
    questoes.addAll(questoes);
}

}