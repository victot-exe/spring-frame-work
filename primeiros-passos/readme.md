# Spring boot 
* Comand Line Runner => Interface que o springBoot usa para prover os mecanismos para criar novas instancias. _Elimina a necessidade de usar o `= new ...`
* `@Autowired` => Notação que diz para o spring realizar a injeção de dependência e criar a instância.  
* @Component => quando serão componentes a serem escaneados na aplicação (quando tem acesso ao código fonte).
* Beans => Objetos gerenciados pelo Spring que serão providos através da injeção de dependência do maven (<dependence>...)

## Singleton x Prototype
* Singleton -> Uma única instância de um objeto.
* Prototype -> varias instâncias de um mesmo molde

## Properties
* application.properties -> garente que o valor não vai sofrer alterações no decorrer da aplicação
* Não usa igual `@value("{variavel}")` => ele busca os valores no arquivo application.properties

## Configuration properties
* @ConfigurationProperties (prefix)
* depende do apllication.properties
* Quando precisa ter um interação de envio e recebimento de informações
* A proposta é: quando tem um @bean de configuração que os seus valores vão vir através do application.properties

## ORM e JPA
* ORM -> Objetct-Relational Mapping => Aproxima o paradigma de orientação a objetos ao contexto de banco de dados relacional
  * Mapeia os objetos para uma table por uma biblioteca ou fremework
* JPA -> Java Persistence API => É uma especificação baseada em interdaces.
* Através de um framework realiza operações de persistência de objetos em Java.
* Aspectos das anotações JPA:
  * Identificação da classe
  * Definição dos atributos (relacionadas ao DDL)
    * determina qual valor é chave, qual é obrigatório, máximo de caracteres, etc...
  * Relacionamento -> relacionamentos entre tables
  * Herança (provém mecanismos de herenças da POO)
  * Persistência (Valores padão ou que já devem ser adicionados)
  
## Spring Data SPA
* Adiciona uma camada sobre o JPA