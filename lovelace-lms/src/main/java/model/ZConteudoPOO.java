package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ZConteudoPOO {

// Classe criada para deixar uma instância de companion pronta para demonstração no ato de submissão do projeto.
// Tendo em vista que não é possível trabalhar com banco de dados, preparamos o código para instanciar automaticamente um companion quando for iniciado, 
// permitindo assim que essas funcionalidades fossem mostradas.

    public static Companion instanciar(){
        Companion pootato = new Companion("Pootato", "--pootato", "admin");
        Modulo poo1 = new Modulo("Programação Orientada a Objetos I");
        pootato.addModulo(poo1);
        Tema intro = new Tema("Introdução à Programação Orientada a Objetos");
        poo1.addTema(intro);
        
        // Adição de texto ao tema
        intro.addParagrafo("A Programação Orientada a Objetos (POO) é um paradigma de programação que organiza o desenvolvimento de software em torno de objetos, em vez de funções e lógica. Esses objetos são instâncias de classes, que podem ser vistas como moldes ou modelos que definem características (atributos) e comportamentos (métodos) que os objetos criados a partir delas terão.");
        intro.addParagrafo("### O que é um Paradigma de Programação? ###\n" + //
                        "\n" + //
                        "Um paradigma de programação é um estilo ou abordagem para a resolução de problemas através da programação. Assim como diferentes idiomas têm suas próprias regras gramaticais, diferentes paradigmas de programação têm suas próprias regras e formas de pensar sobre como construir e organizar código.");
        intro.addParagrafo("### Os principais paradigmas de programação incluem: ###\n" + //
                        "\n" + //
                        "    - Programação Procedural: Baseia-se na execução sequencial de instruções. O foco está em funções e procedimentos que manipulam dados. Exemplo: Linguagens como C e Pascal.\n" + //
                        "\n" + //
                        "    - Programação Funcional: Foca em funções matemáticas e evita estados mutáveis e efeitos colaterais. Exemplo: Haskell e Lisp.\n" + //
                        "\n" + //
                        "    - Programação Orientada a Objetos: Estrutura o software em torno de objetos que interagem entre si. Exemplo: Java, Python e C++.");
        intro.addParagrafo("### Diferença entre POO e Programação Procedural ###\n" + //
                        "\n" + //
                        "A principal diferença entre a Programação Orientada a Objetos e a Programação Procedural está na forma como os problemas são modelados e resolvidos:");
        intro.addParagrafo("Programação Procedural: O foco está em dividir o programa em um conjunto de funções ou procedimentos. Cada função realiza uma tarefa específica, e os dados são passados entre essas funções.\n" + //
                        "\n" + //
                        "    Exemplo: Em um programa de controle de estoque, a lógica poderia ser organizada em funções como adicionarProduto, removerProduto, e atualizarEstoque. Cada função manipula diretamente os dados do estoque.\n" + //
                        "\n" + //
                        "Programação Orientada a Objetos: O foco está em modelar o problema através de objetos que representam entidades do mundo real ou conceitos abstratos. Esses objetos contêm tanto dados quanto comportamentos.\n" + //
                        "\n" + //
                        "    Exemplo: No mesmo sistema de controle de estoque, poderíamos ter uma classe Produto, com atributos como nome, quantidade, e métodos como adicionarEstoque, removerEstoque. Cada produto seria um objeto com seus próprios dados e comportamentos, facilitando a organização e manutenção do código.");
        intro.addParagrafo("### Por que usar POO? ###\n" + //
                        "\n" + //
                        "A POO é amplamente utilizada por oferecer várias vantagens:\n" + //
                        "\n" + //
                        "    - Reuso de Código: Com a POO, é possível criar classes genéricas e reutilizá-las em diferentes partes de um programa ou em diferentes projetos.\n" + //
                        "\n" + //
                        "    - Organização e Manutenção: A POO permite uma melhor organização do código, tornando-o mais fácil de entender e manter. Classes e objetos proporcionam uma estrutura natural para modelar problemas complexos.\n" + //
                        "\n" + //
                        "    - Flexibilidade: Através da herança e polimorfismo, a POO permite que o código seja flexível e extensível. Novas funcionalidades podem ser adicionadas sem alterar o código existente.\n" + //
                        "\n" + //
                        "    - Representação do Mundo Real: A POO facilita a modelagem de problemas reais, pois objetos em código podem representar diretamente entidades do mundo real ou conceitos abstratos, tornando o software mais intuitivo e natural de desenvolver.");   
        intro.addParagrafo("Conclusão\n" + //
                        "\n" + //
                        "A Programação Orientada a Objetos é uma poderosa abordagem de desenvolvimento de software que organiza o código em torno de objetos que possuem atributos e métodos. Com uma estrutura que favorece a reutilização de código, a organização e a manutenção, a POO é amplamente utilizada em projetos de software modernos, sendo essencial para o desenvolvimento de sistemas complexos e escaláveis.");             
        

        // Instanciando e adicionando exercícios ao tema
        QuestaoFechada p1 = new QuestaoFechada("O que é um paradigma de programação?");
        p1.setResposta("Um estilo ou abordagem para resolver problemas através da programação.");
        p1.addAlternativas("Uma ferramenta de programação utilizada para depurar códigos."); 
        p1.addAlternativas("Um tipo de erro comum em linguagens de programação orientadas a objetos.");
        p1.addAlternativas("Uma linguagem de programação específica usada em sistemas de banco de dados.");
        
        QuestaoFechada p2 = new QuestaoFechada("Na Programação Orientada a Objetos (POO), o que é uma classe?");
        p2.setResposta("Um molde ou modelo que define atributos e métodos para criar objetos.");
        p2.addAlternativas("Um bloco de código que executa uma tarefa específica.");
        p2.addAlternativas("Um tipo de dado que armazena múltiplos valores.");
        p2.addAlternativas("Um processo que permite que um programa interaja com o sistema operacional.");

        QuestaoFechada p3 = new QuestaoFechada("Qual das alternativas abaixo é uma vantagem da Programação Orientada a Objetos?");
        p3.setResposta("Melhora a organização e manutenção do código.");
        p3.addAlternativas("Reduz o tempo de execução dos programas.");
        p3.addAlternativas("Facilita a depuração automática de código.");
        p3.addAlternativas("Elimina a necessidade de escrever código repetitivo.");

        QuestaoFechada p4 = new QuestaoFechada("Qual é a principal diferença entre Programação Procedural e Programação Orientada a Objetos?");
        p4.setResposta("A Programação Procedural organiza o código em torno de funções, enquanto a POO organiza o código em torno de objetos.");
        p4.addAlternativas("A Programação Procedural é usada apenas em linguagens de baixo nível, enquanto a POO é usada em linguagens de alto nível.");
        p4.addAlternativas("A Programação Procedural não permite reutilização de código, enquanto a POO não permite modularidade.");
        p4.addAlternativas("A Programação Procedural só pode ser usada em sistemas operacionais específicos, enquanto a POO é multiplataforma.");

        QuestaoFechada p5 = new QuestaoFechada("Qual dos exemplos a seguir melhor representa a Programação Orientada a Objetos?");
        p5.setResposta("Definir uma classe Carro com atributos como marca, modelo, e métodos como acelerar.");
        p5.addAlternativas("Escrever um script que processa uma lista de números em ordem crescente.");
        p5.addAlternativas("Criar uma função que calcula a média de um conjunto de valores.");
        p5.addAlternativas("Escrever um código que imprime \"Olá, Mundo!\" na tela.");

        // Criando um exercício com essas questões
        List<QuestaoImpl> questoes = new ArrayList<QuestaoImpl>(Arrays.asList(p1,p2,p3,p4,p5));
        Exercicio e1 = new Exercicio();
        e1.addQuestao(questoes);

        //Adicionando o exercício ao tema
        intro.addExercicio(e1);
        return pootato;
    }
}
