package model;

public abstract class QuestaoImpl implements Questao{
    String enunciado;
    String resposta;

    public QuestaoImpl(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    public String getResposta(){
        if (this.resposta != null) return this.resposta;
        else return "Resposta não informada";
    }

    public String getEnunciado(){
        return this.enunciado;
    }
    
    public boolean corrigir(String entrada){
        boolean correta = this.getResposta().equals(entrada);
        return correta;
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Questao)) return false;
        Questao q = (Questao) obj;
        if (this.getEnunciado().equals(q.getEnunciado()) && this.getResposta().equals(q.getResposta())) return true;
        return false;
    }

}
