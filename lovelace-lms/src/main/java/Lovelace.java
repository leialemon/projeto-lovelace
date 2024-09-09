import model.Companion;
import model.ZConteudoPOO;
import repository.*;
import controller.*;
import java.util.Scanner;

public class Lovelace {

    // Dois modos de acesso: aluno e admin;
    // Aluno apenas lê as coisas e responde questões;
    // Admin consegue criar e editar
    // Main: 1.checar os argumentos da linha de comando; 2. Instanciar Menus; 

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Companion pootato = ZConteudoPOO.instanciar();
        Menu menu = new MenuImpl();
        RepositorioCompanion companions = menu.getRepositorioCompanion();
        companions.adicionar(pootato);
        
        //iniciar service para salvar no repositório;


        Companion companionAtivo = null;
        boolean admin = false;
        int argumentos = args.length;
        if (argumentos > 0){
            for (int i = 0; i < argumentos; i++){
                for (Companion c : companions.getList()){
                    if(args[i].equals(c.getFlag())){
                        companionAtivo = c;
                    }
                }
                if (args[i].equals("--admin")){
                    admin = true;
                }
            }
        }

        if(admin == true && companionAtivo != null){
            if (!ValidadorDeEntradas.checarSenha(entrada, companionAtivo)){
                System.out.println("Senha de administrador inválida");
                System.out.println("Encerrando o programa.");
                return;
            }
        }

        if (companionAtivo != null){
            if (companionAtivo.equals(pootato)) System.out.println("pootato ativo");
        } else{
            System.out.println("funcionando");
        }

        // Permitir que se acesse os companions nos dois modos através do menu. As flags são apenas um atalho.

        
        
        String robo4 = """
                    /            Olá!      
                   ["]  ,<     Eu sou %s, seu Companion de aprendizado!
                   [~]\\/      
                   OOO        
                           """;      
    
        robo4 = String.format(robo4, "Pootato");
        System.out.println(robo4);
                        }    
}
