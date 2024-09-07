package model;

import java.util.ArrayList;
import java.util.List;

public class QuestaoFechada extends QuestaoImpl{
    
    List<String> alternativas;
    
     public QuestaoFechada(String enunciado){
         super(enunciado);   
         this.alternativas = new ArrayList<>();  
     }


     public void addAlternativas(String alternativa){
        this.alternativas.add(alternativa);
     }

     public List<String> getAlternativas(){
      return this.alternativas;
     }
}
