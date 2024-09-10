import model.Companion;
import model.ZConteudoPOO;
import controller.*;
import service.ServiceImpl;
import view.MenuImpl;

import java.util.List;

public class Lovelace {

    // Dois modos de acesso: aluno e admin;
    // Aluno apenas lê as coisas e responde questões;
    // Admin consegue criar e editar
    // Atribuições do método main: 1.checar os argumentos da linha de comando; 2. Instanciar Menus; 

    public static void main(String[] args){

        Companion pootato = ZConteudoPOO.instanciar();
        ServiceImpl service = new ServiceImpl();
        List<Companion> companions = service.getCompanions();
        MenuImpl menu = new MenuImpl();
        menu.setService(service);
        service.getRepoCompanion().adicionar(pootato);
        

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
    }    
}
