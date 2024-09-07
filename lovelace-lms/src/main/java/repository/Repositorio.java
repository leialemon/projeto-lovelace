package repository;

import java.util.List;

public interface Repositorio<T> {
    // Métodos CRUD
    public void adicionar(T t);
    public boolean buscar(T t);
    public void editar (T t);
    public void apagar(T t);
    public List<T> getList();
}
