package service;

import repository.Repositorio;


public interface Service<T>{
    public void setRepositorio(Repositorio<T> repositorio);
    public void criar(T t);
    public void excluir(T t);
    public void editar(T t);
    public void mostrar(T t);
    
}
