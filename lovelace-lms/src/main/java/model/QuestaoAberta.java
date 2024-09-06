package model;

public class QuestaoAberta extends Questao{
    
    String resposta;
    
    public QuestaoAberta(String enunciado, String resposta){
            super(enunciado);
            this.resposta = resposta;
        }
    
    public boolean checarResposta(String entrada){
        boolean correta = this.resposta.equals(entrada);
        return correta;
    }

    public String getResposta(){
        return this.resposta;
    }

}