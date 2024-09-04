package repository;

import java.util.List;

public interface CRUDRepositorio<T> {
    void cadastrar(T t);
    void excluir(T t);
    T consultar(int id);
    void atualizar(T t);
    List<T> listar(T t);
}
