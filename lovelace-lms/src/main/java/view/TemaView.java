package view;

import model.Tema;
 
public class TemaView {
    public static void mostrarTema(Tema t){
        TextoView.mostrarTexto(t);
        ExercicioView.mostrarExercicio(t.getExercicio());
    }
}
