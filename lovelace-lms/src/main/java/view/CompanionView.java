package view;
import model.*;

import java.util.Scanner;

public abstract class CompanionView{
    public static void mostrarModulos(Companion c){
        int i = 0;
        for (Modulo modulo : c.getModulos()){
            System.out.println(++i + ". " + modulo.getNome());
        }
    }
    public static void criarCompanion(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("###############");
        System.out.println("\n Vamos criar um companion juntos, basta seguir os passos abaixo!\n");
        System.out.println("Primeiro digite um nome para o seu companion:");
        String nome = entrada.nextLine();
        System.out.println("\nLegal! O seu companion vai se chamar "+nome);
        System.out.println("Agora vamos escolher uma flag para o seu companion. \nA flag é uma palavra a sua escolha que poderá ser usada na linha de comando ao executar este programa.");
        System.out.println("Usando a flag o usuário vai conseguir acesar seu companion sem precisar passar pelo menu principal!");
        System.out.println("Por convenção, recomendamos que a flag inicie por um ou dois hífens e só contenha letras minúsculas. \nEx.: --lovelace");
        System.out.println("\nDigite uma flag para seu companion:");
        String flag = entrada.nextLine();
        System.out.println("\nAgora escolha a senha de administrador do seu companion. Você só irá conseguir editá-lo mais tarde usando esta senha.");
        System.out.println("\nDigite a senha de administrador do seu companion:");
        System.out.println("Você pode escolher um avatar para seu companion:");
    }
}