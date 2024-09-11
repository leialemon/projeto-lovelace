package view;
import controller.ValidadorDeEntradas;
import model.*;

import java.util.Scanner;

public abstract class CompanionView{

    static String robos = """
                    ;         /           ,--.    \s
                   ["]       ["]  ,<     |__**|   \s
                  /[_]\\      [~]\\/       |//  |   \s
             1.    ] [   2.  OOO     3.  /o|__|       4. Sem avatar
            """;

    public static String getRobos(){
        return robos;
    }

    public static void mostrarModulos(Companion c){
        int i = 0;
        for (Modulo modulo : c.getModulos()){
            System.out.println(++i + ". " + modulo.getNome());
        }
    }
    public static Companion criarCompanion(){
        // Recebe do usuário os dados para instanciar um companion;
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
        String senha = entrada.nextLine();
        System.out.println("Você pode escolher um avatar para seu companion:");
        System.out.println();
        System.out.println(CompanionView.getRobos());
        int robo = ValidadorDeEntradas.validarOpcoes(1,4);
        String avatar = null;
        switch (robo){
            case 1:
                avatar = Avatar.getRobo1();
                break;
            case 2:
                avatar = Avatar.getRobo2();
                break;
            case 3:
                avatar = Avatar.getRobo3();
                break;
        }
        Companion c = new Companion(nome, flag, senha);
        if (avatar != null){
            c.setAvatar(avatar);
        }
        return c;
    }

    public static void adicionarModulos(Companion c){}

}