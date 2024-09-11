package view;

import controller.ValidadorDeEntradas;
import model.*;

import java.util.List;
import java.util.Scanner;

public class ModuloView {
    public static void mostrarTemas(Modulo m){
        int i = 0;
        for (Tema t : m.getTemas()){
            System.out.println(++i + ". " + t.getNome());
        }
        System.out.println(++i + ". Voltar à página anterior");
    }

    public static int mostrarModulos(List<Modulo> modulos){
        System.out.println("\n ### Módulos Cadastrados ###");
        int i = 2;
        System.out.println(0 + ". Voltar ao menu anterior");
        System.out.println("1 . Criar novo Módulo");
        for (Modulo m : modulos){
            System.out.println(++i + ". " + m.getNome());
        }
        int opcao = ValidadorDeEntradas.validarOpcoes(0,(modulos.size()+2));
        return opcao;
    }

    public static Modulo criarModulo(){
        Scanner entrada = Menu.entrada;
        System.out.println("###############");
        System.out.println("\n Vamos criar um novo módulo juntos, basta seguir os passos abaixo!\n");
        System.out.println("Digite um nome para o seu módulo");
        System.out.println("(O nome deve indicar a disciplina abordada no módulo)");
        String nome = entrada.next();
        Modulo modulo = new Modulo(nome);
        return modulo;
    }
}
