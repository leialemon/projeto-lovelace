package service;

import java.util.List;

public interface CRUDServico<T> {
    void cadastrar(T t);
    void excluir(T t);
    T consultar(int id);
    void atualizar(T t);
    List<T> listar(T t);
}
