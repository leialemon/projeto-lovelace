package repository;

import java.util.ArrayList;
import java.util.List;
import model.*;

public class RepositorioQuestoes extends RepositorioImpl<Questao>{
    List<QuestaoImpl> bancoDeQuestoes = new ArrayList<>();
    public void adicionar(QuestaoImpl questao){}
    public void buscar(QuestaoImpl questao){}
    public void editar (QuestaoImpl questao){}
    public void apagar(QuestaoImpl questao){}
}
