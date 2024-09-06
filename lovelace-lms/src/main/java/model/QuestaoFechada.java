package model;

import java.util.List;

public class QuestaoFechada extends Questao{
    
    String respostaCerta;
    List<String> alternativas;
    
     public QuestaoFechada(String enunciado){
        super(enunciado);
     }

     public void addAlternativaCorreta(String resposta){
        this.respostaCerta = resposta;
     }

     public void addAlternativas(String alternativa){
        alternativas.add(alternativa);
     }

     // método para selecionar posição aleatória da resposta correta.
}
