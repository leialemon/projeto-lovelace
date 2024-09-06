package model;

import java.util.ArrayList;
import java.util.List;

public class Companion {
    String nome;
    String flag;
    String senha;
    List<Modulo> modulos = new ArrayList<>();

    public Companion(String nome, String flag, String senha){
        this.nome = nome;
        this.flag = flag;
        this.senha = senha;
    }

    public String getFlag(){
        return this.flag;
    }

    public String getSenha(){
        return this.senha;
    }

    public List<Modulo> getModulos(){
        return this.modulos;
    }

    public void addModulo(Modulo modulo){
        modulos.add(modulo);
    }
}
