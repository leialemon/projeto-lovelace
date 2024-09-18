<img style="margin-left: auto; margin-right: auto;" src="/Readme-content/boasvindas.png" alt="Print de um terminal onde está impresso o texto 'Boas-vindas ao Projeto Lovelace!';" >

# 🤖 Projeto Lovelace
#### LMS modular e minificado
O projeto Lovelace foi desenvolvido para a [hackathon](https://gist.github.com/rafarocha/6bbc76e474a54c439966db449b5ed19a) do módulo Programação Orientada a Objetos II, do curso Ada B3 Inclua+.

### 🏆 Projeto vencedor nas categorias de Melhor Design Visual Console e Melhor Projeto!


É o projeto de um LMS (Learning Management System) modular e minificado, onde os usuários podem acessar conteúdos educacionais.

A proposta da modularidade é permitir a criação rápida de vários ambientes de aprendizado amigáveis (companions) cujo conteúdo pode ser facilmente gerenciado através da biblioteca de módulos.

O projeto teve que atender a uma série de requisitos que limitaram sua funcionalidade, como a proibição do uso de ferramentas de persistência de dados e do uso de interfaces gráficas, por isso possui uma versão minificada das operações.

Os requisitos de participação na hackaton podem ser conferidos [aqui.](https://gist.github.com/rafarocha/6bbc76e474a54c439966db449b5ed19a)

## 📑 Instruções

Para usar o Lovelace, você deve compilar e executar a classe java Lovelace.java. Isto pode ser feito de forma manual ou automática, através da execução do script bash [lovelace.sh](/lovelace.sh).

A partir daí é possível usar o lovelace para criar novos companions ou acessar companions existentes. 

O sistema de menus foi pensado para que a navegação fosse intuitiva e demandasse do usuário o mínimo de conhecimentos prévios sobre o programa.

Ao acessar um companion, o usuário poderá fazê-lo no modo **Aluno** ou no modo **Administrador**.

### 🔑 Modos de acesso
O modo **aluno** é o modo padrão e permite apenas a visualização do conteúdo dos módulos do companion e a realização dos exercícios.

Já o modo **administrador** permite a edição e exclusão do companion. Para acessar este modo, é preciso fornecer ao programa uma senha de administrador, configurada na criação do companion.

### 🏁 Flags
Ao criar um novo companion deve-se definir uma "flag", uma palavra-chave que pode ser usada de argumento no terminal para executar o Lovelace já com o companion selecionado.

Para acessar um companion diretamente no modo administrador é preciso executar o programa com a flag do companion e a flag "--admin".

## 🥔 POOtato

<img style="margin-left: auto; margin-right: auto;" src="/Readme-content/pootato.png" alt="Print de um terminal onde aparece um robô impresso ASCII e o texto 'Olá! Eu sou o Pootato, seu companion de aprendizado!';" >


O POOtato é um companion já criado injetado diretamente no código para que seja possível testar algumas funcionalidades do Lovelace.

Para chamar o POOtato, você pode:
1. Selecioná-lo no menu principal;
2. Iniciar o programa na linha de comando com o argumento "--pootato";
3. Executar o script [pootato.sh](/pootato.sh).

Para entrar no modo de administrador do POOtato, você pode:
1. Selecionar este modo no menu de acesso;
2. Iniciar o programa na linha de comando com os argumentos "--pootato" e "--admin";

#### 🛂 A senha de administrador do POOtato é "admin".


### Créditos
Artes ASCII por: https://ascii.co.uk/art/robot

Conteúdos do pootato criados pelo chatGPT com o GPT-4o.


