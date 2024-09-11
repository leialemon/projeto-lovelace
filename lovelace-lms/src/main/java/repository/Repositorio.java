package repository;

import service.Status;

import java.util.List;

public interface Repositorio<T> {
    // Métodos CRUD
    public Status adicionar(T t);
    public Status buscar(T t);
    public Status apagar(T t);
    public List<T> getList();
}
