package view;
import java.util.List;
import java.util.Scanner;

import model.Tema;

public class TextoView{
    public static void mostrarTexto(Tema tema){
        Scanner continuar = Menu.entrada;
        List<String> texto = tema.getTexto();
        System.out.println();
        System.out.println("### "+tema.getNome().toUpperCase()+" ###");
        for (String paragrafo : texto){
            System.out.println();
            System.out.println(paragrafo);
            System.out.println();
            System.out.println("(pressione qualquer tecla para continuar)");
            continuar.next();
        }
        System.out.println("### FIM ###");
    }
}
