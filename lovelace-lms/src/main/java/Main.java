import model.Companion;
import repository.Repositorio;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import service.CompanionService;
import service.ModuloService;
import service.Service;

public class Main {
    public static void main(String[] args){
        RepositorioCompanion companions = new RepositorioCompanion();
        Repositorio modulos = new RepositorioModulo();

        Companion companionAtivo = null;
        boolean admin;
        int argumentos = args.length;
        if (argumentos > 0){
            for (int i = 0; i < argumentos; i++){
                for (Companion c : companions.getCompanions()){
                    if(args[i].equals(c.getFlag())){
                        companionAtivo = c;
                    }
                }
                if (args[i].equals("admin")){
                    admin = true;
                }
            }
        }
        Service companionService = new CompanionService(companions, modulos, companionAtivo);
        Service moduloService = new ModuloService(modulos);


    }
}
