package view;

import java.util.List;
import java.util.Scanner;

import controller.ValidadorDeEntradas;
import service.*;
import model.*;

public class MenuImpl{
    Companion companion;
    ServiceImpl service;

    public void setService(ServiceImpl s){
        service = s;
    }

    public ServiceImpl getService(){
        return service;
    }

    public void setCompanionAtivo(Companion c){
        this.companion = c;
    }

    public void chamarMenus(){
        // Boas vindas geral

        // menus genéricos para seleção de companion e modo
        //Selecionar Companion
            //1. abrir companion (menu aluno)/ 2. editar companion (menu admin)
        //Criar Companion
        //Criar Módulo 
        //Cadastrar Questão

        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa\n");
        System.out.println("\n1. Selecionar Companion");
        System.out.println("2. Criar Companion");
        System.out.println("3. Criar Módulo");
        System.out.println("4. Cadastrar Questão");
        int opcao = ValidadorDeEntradas.validarOpcoes(0,4);
        switch (opcao){
            case 0:
                return;
            case 1:
                this.selecionarCompanion();
                break;
            case 2:
                //Métoodo view de criação -> controller -> service -> repository
                break;
            case 3:
                //Métoodo view de criação -> controller -> service -> repository
                break;
            case 4:
                //Métoodo view de criação -> controller -> service -> repository
                break;
        }
    }

    public void selecionarCompanion(){
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa\n");
        //mostrar lista de companions
        List<Companion> companions = service.getCompanions();
        int back = companions.size() + 1;
        int i = 0;
        for (Companion c : companions){
            System.out.println(++i + c.getNome());
        }
        System.out.println(back + ". Voltar ao menu anterior");
        int opcao = ValidadorDeEntradas.validarOpcoes(0, back);
        if (opcao == 0){
            return;
        }
        if (opcao == back){
            this.chamarMenus();
        } else {
            Companion companionEscolhido = companions.get(opcao - 1);
            System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa\n");
            System.out.println("1. Acessar como aluno");
            System.out.println("2. Acessar como administrador");
            System.out.println("3. Voltar ao menu anterior");
            opcao = ValidadorDeEntradas.validarOpcoes(0,3);
            switch (opcao){
                case 0:
                    return;
                case 1:
                    this.chamarMenuAluno(companionEscolhido);
                    break;
                case 2:
                    this.chamarMenuAdmin(companionEscolhido);
                    break;
                case 3:
                    this.selecionarCompanion();
                    break;
            }
        }

    }


    public void chamarMenuAluno(Companion companion){
        MenuAluno menuAluno = new MenuAluno(companion);
        menuAluno.mostrarMenuInicial();
    }

    public void chamarMenuAdmin(Companion companion){
        MenuAdmin menuAdmin = new MenuAdmin(companion);
        menuAdmin.verificarAcesso();
    }
}
