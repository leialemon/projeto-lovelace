package repository;

import java.util.ArrayList;
import java.util.List;
import model.*;
import service.Status;

public class RepositorioQuestoes implements Repositorio<Questao>{
    List<Questao> bancoDeQuestoes = new ArrayList<>();
    
    @Override
    public List<Questao> getList(){
        return this.bancoDeQuestoes;
    }

    @Override
    public Status adicionar(Questao questao){
        if (this.buscar(questao) == Status.TUDO_CERTO){
            return Status.JA_EXISTE;
        }
        this.bancoDeQuestoes.add(questao);
        return Status.TUDO_CERTO;
    }
    
    @Override
    public Status buscar(Questao questao){
        if (questao == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return Status.INSTANCIA_NULA;
        }        
        for (Questao q : this.bancoDeQuestoes){
            if (questao.equals(q)) return Status.TUDO_CERTO;
        }
        return Status.NAO_EXISTE;
    }

    @Override
    public Status apagar(Questao questao){
        for (Questao q : this.bancoDeQuestoes){
            if(questao.equals(q)){
                this.bancoDeQuestoes.remove(q);
                return Status.TUDO_CERTO;
            }
        }
        return Status.NAO_EXISTE;
    }
}
