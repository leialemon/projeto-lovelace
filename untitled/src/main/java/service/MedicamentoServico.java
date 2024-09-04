package service;

import model.Medicamento;

import java.util.List;

public class MedicamentoServico implements CRUDServico<Medicamento>{

    @Override
    public void cadastrar(Medicamento medicamento) {

    }

    @Override
    public void excluir(Medicamento medicamento) {

    }

    @Override
    public Medicamento consultar(int id) {
        return null;
    }

    @Override
    public void atualizar(Medicamento medicamento) {

    }

    @Override
    public List<Medicamento> listar(Medicamento medicamento) {
        return List.of();
    }
}
