package repository;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class RepositorioQuestoes implements Repositorio<Questao>{
    List<Questao> bancoDeQuestoes = new ArrayList<>();
    
    @Override
    public List<Questao> getList(){
        return this.bancoDeQuestoes;
    }

    @Override
    public void adicionar(Questao questao){
        this.bancoDeQuestoes.add(questao); 
    }
    
    @Override
    public boolean buscar(Questao questao){
        if (questao == null){
            System.err.println("A pesquisa não pode ser feita com valores nulos!");
            return false;
        }        
        for (Questao q : this.bancoDeQuestoes){
            if (questao.equals(q)) return true;
        }
        return false;  
    }

    @Override
    public void editar (Questao questao){}

    @Override
    public void apagar(Questao questao){}
}
