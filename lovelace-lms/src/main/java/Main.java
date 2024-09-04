import repository.Repositorio;
import repository.RepositorioCompanion;
import repository.RepositorioModulo;
import service.CompanionService;
import service.ModuloService;
import service.Service;

public class Main {
    public static void main(String[] args){
        Repositorio companions = new RepositorioCompanion();
        Repositorio modulos = new RepositorioModulo();

        Service companionService = new CompanionService(companions, modulos);
        Service moduloService = new ModuloService(modulos);
    }
}
