package view;

import model.*;

public class ModuloView {
    public static void mostrarTemas(Modulo m){
        int i = 0;
        for (Tema t : m.getTemas()){
            System.out.println(++i + ". " + t.getNome());
        }
        System.out.println(++i + ". Voltar à página anterior");
    }
}
