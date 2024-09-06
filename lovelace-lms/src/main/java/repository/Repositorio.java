package repository;

public interface Repositorio<T> {
    // Métodos CRUD
    public void adicionar(T t);
    public void buscar(T t);
    public void editar (T t);
    public void apagar(T t);
}
