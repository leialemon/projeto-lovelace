package repository;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class RepositorioQuestoes implements Repositorio<Questao>{
    List<Questao> bancoDeQuestoes = new ArrayList<>();
    public void adicionar(Questao questao){}
    public void buscar(Questao questao){}
    public void editar (Questao questao){}
    public void apagar(Questao questao){}
}
