import model.Companion;
import model.ConteudoPOO;
import repository.Repositorio;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import service.CompanionService;
import service.ModuloService;
import service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Companion pootato = ConteudoPOO.instanciar();
        RepositorioCompanion companions = new RepositorioCompanion();
        companions.adicionar(pootato);
        RepositorioModulo modulos = new RepositorioModulo();
        //iniciar service para salvar no repositório;


        Companion companionAtivo = null;
        boolean admin = false;
        int argumentos = args.length;
        if (argumentos > 0){
            for (int i = 0; i < argumentos; i++){
                for (Companion c : companions.getCompanions()){
                    if(args[i].equals(c.getFlag())){
                        companionAtivo = c;
                    }
                }
                if (args[i].equals("--admin")){
                    admin = true;
                    System.out.println("admin");
                }
            }
        }
        Service companionService = new CompanionService(companions, companionAtivo);
        Service moduloService = new ModuloService(modulos);

        if(admin == true && companionAtivo != null){
            if (!checarSenha(entrada, companionAtivo)){
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


    }

    public static boolean checarSenha(Scanner entrada, Companion companion){
        boolean senhaCorreta = false;
        boolean sair = false;
        do{
            System.out.println("Por favor, digite sua senha de administrador:");
            if (entrada.nextLine().equals(companion.getSenha())){
                senhaCorreta = true;
                return senhaCorreta;
            }
            System.out.println("Senha incorreta! Digite 1 para tentar novamente ou 2 para sair do programa");
            if (entrada.nextInt() == 2){
                sair = true;
                break;
            }
        }while (!senhaCorreta || sair);

        return senhaCorreta;
    }

    
}
