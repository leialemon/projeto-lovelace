package view;

import java.util.List;
import java.util.Scanner;

import controller.Controller;
import controller.QuestaoController;
import controller.ValidadorDeEntradas;
import model.*;


public class Menu {
    public static Scanner entrada = new Scanner(System.in);
    Controller<Companion> companionController;
    Controller<Modulo> moduloController;
    Controller<Tema> temaController;
    Controller<Questao> questaoController;

    public void setCompanionController(Controller<Companion> controller){
        this.companionController = controller;
    }

    public void setModuloController(Controller<Modulo> controller){
        this.moduloController = controller;
    }

    public void setTemaController(Controller<Tema> temaController) {
        this.temaController = temaController;
    }

    public void setQuestaoController(Controller<Questao> controller){
        this.questaoController = controller;
    }

    public void chamarMenus(){
        // Boas vindas geral

        // menus genéricos para seleção de companion e modo
        //Selecionar Companion
            //1. abrir companion (menu aluno)/ 2. editar companion (menu admin)
        //Criar Companion
        //Criar Módulo 
        //Cadastrar Questão

        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa");
        System.out.println("1. Selecionar Companion");
        System.out.println("2. Criar novo Companion");
        System.out.println("3. Criar Módulo");
        System.out.println("4. Cadastrar Questão");
        System.out.println("5. Ajuda");
        int opcao = ValidadorDeEntradas.validarOpcoes(0,5);
        switch (opcao){
            case 0:
                return;
            case 1:
                this.selecionarCompanion();
                break;
            case 2:
                Companion criado = CompanionView.criarCompanion();
                this.adicionarModulos(CompanionView.criarCompanion2(companionController.criar(criado), criado), criado);
                break;
            case 3:
                //Métoodo view de criação -> controller -> service -> repository
                break;
            case 4:
                //Métoodo view de criação -> controller -> service -> repository
                break;
            case 5:
                this.mostrarAjuda();
                break;
        }
        this.chamarMenus();
    }

    public void selecionarCompanion(){
        System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa");
        //mostrar lista de companions
        List<Companion> companions = companionController.getList();
        int back = companions.size() + 1;
        int i = 0;
        for (Companion c : companions){
            System.out.println(++i + ". "+ c.getNome());
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
            System.out.println("\nEscolha uma das opções abaixo ou digite '0' para sair do programa");
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

    public void mostrarAjuda(){
        System.out.println("### INSTRUÇÕES ###");
        System.out.println("O Lovelace é um LMS (Learning Management System) minificado e modular.");
        System.out.println("Cada 'Companion' é um ambiente de aprendizado independente que abriga uma coleção de módulos com material didático e exercícios.");
        System.out.println("Para criar um companion, selecione a opção 'Criar novo companion' no menu principal e siga as instruções correspondentes.");
        System.out.println("Para acessar um companion existente, selecione a opção 'Selecionar companion' no menu principal ou inicie o programa com a flag correspondente.");
        System.out.println("(pressione qualquer tecla para continuar)");
        entrada.next();
        System.out.println("\nCada companion pode ser acessado em dois modos:");
        System.out.println("1. Modo aluno - permite apenas a visualização do conteúdo do companion e resolução de exercícios.");
        System.out.println("2. Modo administrador - permite editar ou excluir o companion.");
        System.out.println("\nPara acessar o modo administrador é necessário fornecer uma senha, configurada no momento da criação do companion.");
        System.out.println("\nO modo administrador está disponível no menu de seleção de companion ou ao iniciar o programa, utilizando-se a flag do companion e a flag '--admin.'");
        System.out.println("Exemplo: java Lovelace --companion -- admin");
        System.out.println("(pressione qualquer tecla para continuar)");
        entrada.next();
        System.out.println("\nCada módulo de um companion representa o domínio de uma disciplina.");
        System.out.println("Eles são subdivididos em temas, correspondentes aos tópicos daquela disciplina. Cada tema contém um texto didático e exercícios.");
        System.out.println("\nTodos os módulos, temas e exercícios criados ficam salvos em um banco de dados e podem ser adicionados a novos companions.");
        System.out.println("Para mais informações, confira o arquivo README.");
        System.out.println("\n(pressione qualquer tecla para retornar ao menu principal)");
        entrada.next();
    }

    public void adicionarModulos(int opcao, Companion c){
        if (opcao == 1){
            int modulo = ModuloView.mostrarModulos(moduloController.getList());
            Modulo escolhido = moduloController.getList().get(modulo-2);

        } else {
            System.out.println("Retornando ao menu principal.");
            return;
        }
    }
}
