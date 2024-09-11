package view;

import model.Exercicio;
import model.Tema;

import java.util.Scanner;

public class TemaView {
    public static void mostrarTema(Tema t){
        TextoView.mostrarTexto(t);
        if(t.getExercicio() != null){ ExercicioView.mostrarExercicio(t.getExercicio());}
    }

    public static Tema criarTema(){
        Scanner entrada = Menu.entrada;
        System.out.println("\n#########");
        System.out.println("Criação de Temas");
        System.out.println("\nDigite um nome para o tema, ele deve refletir o tópico abordado:");
        String nome = entrada.next();
        Tema criado = new Tema(nome);
        System.out.println("\n Agora vamos adicionar um texto didático ao seu Tema. Para facilitar a visualização dos usuários, este programa imprime o texto aos poucos, em parágrafos.");
        System.out.println("Adicione o caractere '§' nos locais do seu texto onde você quer que o programa faça a quebra de parágrafo.");
        System.out.println("Digite o texto:");
        String texto = entrada.nextLine();
        criado.addParagrafo(texto);
        return criado;
    }
}
