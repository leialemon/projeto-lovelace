package model;

public class QuestaoAberta extends QuestaoImpl{
    
    
    public QuestaoAberta(String enunciado, String resposta){
            super(enunciado);
            this.setResposta(resposta);
        }
}