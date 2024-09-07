package view;
import java.util.List;
import java.util.Scanner;

import model.Tema;

public class TextoView{
    public static void mostrarTexto(Tema tema){
        Scanner continuar = new Scanner(System.in);
        List<String> texto = tema.getTexto();
        System.out.println();
        System.out.println("### "+tema.getNome().toUpperCase()+" ###");
        for (String paragrafo : texto){
            System.out.println();
            System.out.println(paragrafo);
            System.out.println();
            System.out.println("(mostrar mais)");
            continuar.next();
        }
        continuar.close();
    }
}
