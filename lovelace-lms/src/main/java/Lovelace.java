
import model.Companion;
import model.ZConteudoPOO;
import controller.*;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import repository.RepositorioQuestoes;
import repository.RepositorioTema;
import service.CompanionServiceImpl;
import service.ModuloServiceImpl;
import service.QuestaoServiceImpl;
import service.TemaServiceImpl;
import view.Menu;

import java.util.List;

public class Lovelace {

    // Dois modos de acesso: aluno e admin;
    // Aluno apenas lê as coisas e responde questões;
    // Admin consegue criar e editar
    // Atribuições do méttodo main: 1.checar os argumentos da linha de comando; 2. Instanciar Menus;

    public static void main(String[] args){
        // injeção de dados de exemplo
        Companion pootato = ZConteudoPOO.instanciar();

        //Criação dos repositórios
        RepositorioCompanion repositorioCompanion = new RepositorioCompanion();
        RepositorioModulo repositorioModulo = new RepositorioModulo();
        RepositorioTema repositorioTema = new RepositorioTema();
        RepositorioQuestoes repositorioQuestoes = new RepositorioQuestoes();

        //Criação dos services
        CompanionServiceImpl companionService = new CompanionServiceImpl(repositorioCompanion);
        ModuloServiceImpl moduloServiceImpl = new ModuloServiceImpl(repositorioModulo);
        TemaServiceImpl temaServiceImpl = new TemaServiceImpl(repositorioTema);
        QuestaoServiceImpl questaoService = new QuestaoServiceImpl(repositorioQuestoes);

        //Criação dos controllers
        CompanionController companionControllerImpl = new CompanionControllerImpl(companionService);
        ModuloController moduloControllerImpl = new ModuloControllerImpl(moduloServiceImpl);
        TemaController temaControllerImpl = new TemaControllerImpl(temaServiceImpl);
        QuestaoController questaoControllerImpl = new QuestaoControllerImpl(questaoService);

        //Criação do menu principal
        Menu menu = new Menu();
        menu.setCompanionController(companionControllerImpl);
        menu.setModuloController(moduloControllerImpl);
        menu.setTemaController(temaControllerImpl);
        menu.setQuestaoController(questaoControllerImpl);

        companionControllerImpl.criar(pootato);

        List<Companion> companions = companionControllerImpl.getList();
        Companion companionAtivo = null;
        boolean admin = false;
        int argumentos = args.length;
        if (argumentos > 0){
            for (int i = 0; i < argumentos; i++){
                for (Companion c : companions){
                    if(args[i].equals(c.getFlag())){
                        companionAtivo = c;
                    }
                }
                if (args[i].equals("--admin")){
                    admin = true;
                }
            }
        }

        if(admin && companionAtivo != null){
            if (!ValidadorDeEntradas.checarSenha(companionAtivo)){
                System.out.println("Senha de administrador inválida");
                System.out.println("Encerrando o programa.");
                return;
            } else {
                menu.chamarMenuAdmin(companionAtivo);
            }
        } else if (companionAtivo != null){
            menu.chamarMenuAluno(companionAtivo);
        } else {
            menu.chamarMenus();
        }
        System.out.println("Desenvolvido por Juliana Barros");
        System.out.println("contato: julianabarrosf@protonmail.com");
    }    
}
