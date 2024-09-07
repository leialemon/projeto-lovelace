package view;
import java.util.List;

import model.Tema;

public class TextoView{
    public static void mostrarTexto(Tema tema){
        List<String> texto = tema.getTexto();
        System.out.println();
        System.out.println("### "+tema.getNome().toUpperCase()+" ###");
        System.out.println();
        for (String paragrafo : texto){
            System.out.println(paragrafo);
            System.out.println();
        }
    }
}
