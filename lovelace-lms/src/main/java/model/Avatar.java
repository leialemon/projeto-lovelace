package model;

public class Avatar {
    static String robo1 = """
         ,--.     
        |__**|    Olá!
        |//  |    Eu sou %s, seu companion de aprendizado!
        /o|__|

                """;

    static String robo2 = """
        ;       
       ["]        Olá!
      /[_]\\      Eu sou %s, seu companion de aprendizado!
       ] [  
                """;
       
    static String robo3 = """
         /            
        ["]  ,<   Olá!  
        [~]\\/    Eu sou %s, seu companion de aprendizado!  
        OOO        
                """;
    
    public static String getRobo1(){
        return robo1;
    }

    public static String getRobo2(){
        return robo2;
    }

    public static String getRobo3(){
        return robo3;
    }
}
