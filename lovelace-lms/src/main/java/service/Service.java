package service;

import java.util.List;

public interface Service<T> {
    // Métodos CRUD
    public Status criar (T t);
    public Status excluir (T t);
    public void editar (T t);
    public T mostrar(T t);
    public List<T> getList();
}
