package service;

import repository.*;

public interface Service<T> {
    // Métodos CRUD
    public void criar (T t);
    public void excluir (T t);
    public void editar (T t);
    public T mostrar(T t);
}
