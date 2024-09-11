package controller;

import model.Questao;
import service.QuestaoService;
import service.QuestaoServiceImpl;
import service.Service;
import service.Status;
import view.Menu;

import java.util.List;
import java.util.Scanner;

public class QuestaoControllerImpl implements QuestaoController{
    QuestaoService service;

    public QuestaoControllerImpl(QuestaoServiceImpl service){
        this.service = service;
    }

    public static boolean responderQuestaoAberta(Questao q) {
        Scanner entrada = Menu.entrada;
        String tentativa = entrada.nextLine();
        return q.corrigir(tentativa);
    }

    public static boolean responderQuestaoFechada(Questao q, List<String> alternativas){
        Scanner entrada = Menu.entrada;
        String resposta = "";
        boolean valida = false;
        do{
            String tentativa = entrada.next();
            switch (tentativa.toLowerCase()){
                case "a":
                    resposta = alternativas.get(0);
                    valida = true;
                    break;
                case "b":
                    resposta = alternativas.get(1);
                    valida = true;
                    break;
                case "c":
                    resposta = alternativas.get(2);
                    valida = true;
                    break;
                case "d":
                    resposta = alternativas.get(3);
                    valida = true;
                    break;
                default:
                System.out.println("Alternativa inválida! Por favor, tente novamente!");
            }
        } while(!valida);
        return q.corrigir(resposta);
    }

    @Override
    public Status criar(Questao questao) {
        return this.service.criar(questao);
    }

    @Override
    public Status apagar(Questao questao) {
        return this.service.excluir(questao);
    }

    @Override
    public List<Questao> getList() {
        return service.getList();
    }
}
