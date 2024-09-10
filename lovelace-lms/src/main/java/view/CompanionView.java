package view;
import model.*;

public class CompanionView{
    public static void mostrarModulos(Companion c){
        int i = 0;
        for (Modulo modulo : c.getModulos()){
            System.out.println(++i + ". " + modulo.getNome());
        }
    }
}