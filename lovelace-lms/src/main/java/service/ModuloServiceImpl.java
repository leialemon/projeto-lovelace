package service;

import repository.RepositorioModulo;
import model.Modulo;

public class ModuloServiceImpl extends ServiceImpl<Modulo> implements ModuloService{
    
    
    public ModuloServiceImpl(RepositorioModulo repo){
        super.setRepositorio(repo);
    }

    public void criar(Modulo m){
        super.criar(bancoModulos, m);
    };

    public void excluir(Modulo m){
        super.excluir(bancoModulos, m);
    };

    public void editar(Modulo m){
        super.editar(bancoModulos, m);
    };

    public void mostrar(Modulo m){
        super.mostrar(bancoModulos, m);
    };
}
