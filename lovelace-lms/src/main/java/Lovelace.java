import model.Companion;
import model.ZConteudoPOO;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import java.util.Scanner;

public class Lovelace {

    // Dois modos de acesso: aluno e admin;
    // Aluno apenas lê as coisas e responde questões;
    // Admin consegue criar e editar

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Companion pootato = ZConteudoPOO.instanciar();
        RepositorioCompanion companions = new RepositorioCompanion();
        companions.adicionar(pootato);
        RepositorioModulo modulos = new RepositorioModulo();
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
                    System.out.println("admin");
                }
            }
        }

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

        // Permitir que se acesse os companions nos dois modos através do menu. As flags são apenas um atalho.


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
