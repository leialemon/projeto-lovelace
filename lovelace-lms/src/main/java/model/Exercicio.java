package model;

import java.util.List;

public class Exercicio {
    List<Questao> questoes;

// Overloading do método addQuestao permite adicionar questões ao exercício individualmente ou em grupo
public void addQuestao(Questao questao){
    this.questoes.add(questao);
}

public void addQuestao(List<Questao> questoes){
    questoes.addAll(questoes);
}

// método para output questões em ordem aleatória

}