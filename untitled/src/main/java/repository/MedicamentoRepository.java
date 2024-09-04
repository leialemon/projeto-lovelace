package repository;

import model.Medicamento;

import java.util.ArrayList;
import java.util.List;

public class MedicamentoRepository implements  CRUDRepositorio<Medicamento>{

    List<Medicamento> medicamentos = new ArrayList<>();
    static int SEQ = 1;

    private int proximoID(){return SEQ++;}

    @Override
    public Medicamento consultar(int id) {
        return null;
    }

    @Override
    public List<Medicamento> listar(Medicamento medicamento) {
        return this.medicamentos;
    }

    @Override
    public void atualizar(Medicamento medicamento) {

    }

    @Override
    public void cadastrar(Medicamento medicamento) {
        medicamento.setID(proximoID());
        medicamentos.add(medicamento);
    }

    @Override
    public void excluir(Medicamento medicamento) {

    }
}
