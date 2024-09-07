package model;

public interface Questao {
    public String getEnunciado();
    public String getResposta();
    public void setResposta(String reposta);
    public boolean corrigir(String entrada);
}
