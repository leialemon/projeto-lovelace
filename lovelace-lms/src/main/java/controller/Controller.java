package controller;

import service.Status;

import java.util.List;

public interface Controller<T>{
    public Status criar(T t);
    public Status apagar(T t);
    public List<T> getList();
}
