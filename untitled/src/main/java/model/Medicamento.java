package model;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.List;

public class Medicamento {
    String nome;
    int ID;
    List<Dosagem> dosagens;
    List<Concentracao> apresentacoes;

    public Medicamento(String nome){
        this.nome = nome;
    }

    public List<Dosagem> getDosagens(){
        return this.dosagens;
    }

    public List<Concentracao> getApresentacoes(){
        return this.apresentacoes;
    }

    public void adicionarDosagem(Dosagem dosagem){
        dosagens.add(dosagem);
    }

    public void adicionarApresentacao(Concentracao apresentacao) {
        apresentacoes.add(apresentacao);
    }

    public void setID(int id){
        this.ID = id;
    }

    public void calcularDose(){

    }
}
