package model;

import java.util.ArrayList;
import java.util.List;

public class Companion {
    String nome;
    String flag;
    String senha;
    String avatar;
    List<Modulo> modulos = new ArrayList<>();

    public Companion(String nome, String flag, String senha){
        this.nome = nome;
        this.flag = flag;
        this.senha = senha;
    }

    public void setAvatar(String robo){
        this.avatar = String.format(robo, this.nome);
    }

    public String getAvatar(){
        return this.avatar;
    }

    public String getNome(){
        if (this.nome != null) return this.nome;
        else return "Nome não informado.";
    }

    public String getFlag(){
        if (this.flag != null)return this.flag;
        else return "Flag não informada.";
    }

    public String getSenha(){
        if (senha != null)return this.senha;
        else return "Senha não informada.";
    }

    public List<Modulo> getModulos(){
        return this.modulos;
    }

    public void addModulo(Modulo modulo){
        if (modulo != null) modulos.add(modulo);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof Companion)) return false;
        Companion c = (Companion) obj;
        if (this.nome.equals(c.getNome()) && this.flag.equals(c.getFlag()) && this.senha.equals(c.getSenha())) return true;
        return false;
    }
}
