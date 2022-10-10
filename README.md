# Java OO - Herança e Polimorfismo introdução
Relembrando conceitos de Herança e Polimorfismo.
<p></p>

## Visibidade
* private - tem menor visilibidade. Somente sendo acessado na própria classe.
* protected - tem uma função parecida com a private mas pode ser acessada pelas classes filhas. (Relacionado a herança de classes)
* public - visível em todo lugar.
<p></p>

## Idéia de Herança
* Uma classe pode ter várias filhas, mas apenas uma mãe (herança simples).
* Dado uma instância de uma classe podemos chamar qualquer método público que tenha sido declarado na classe mãe.
* Classe mãe pode ser chamada de super ou base class.
* Classe filha pode ser chamada de sub class.
<p></p>

* Podemos ter acesso a atribulos ou métodos através da palavra chave super que acessa a classe mãe, não podemos utilizar o this.
* Não recebemos os contrutores.
<p></p>

## Princípios da Herança
* Reutilização de código.
* Polimorfismo - O tipo de referência de classes mais genérica que referenciam objectos mais específicos. Pode ser uso de classes genérica, com a super class, ou a utilização de interfaces.

<p></p>
<blockquote>
  <p>Objetos não mudam de tipo, mas a referência pode mudar. O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto.
  <br>O Uso de referências mais genéricas permite desacoplar sistemas.</p>
  <p>Quando criamos nosso próprio construtor, o contrustor default deixa de existir, se quiser pode adicionar manualmente um contrutor default explicitamente.
  <p>A anotacação @Override, mostra erros quando não aparece a mesmo método na classe superior, indicando que o método foi alterado na sintaxe.</p>
</blockquote>

### Classes Abstratas
* Classes abstratas representa um conceito que serve para ser aplicado pelas classes filhas concretas, que sim podem ser instânciadas. Ela nos permite o poliformismo, pois deixa usar a refêrencia da classe.
```
public abstract class Funcionario {
  private double salario;
  
  public Funcionario() {}
  
  private double getSalario() {
    return this.salario;
   }
}
```
* Classes abstratas podem possuir métodos concretos e atributos, com o polimorfismo nos ajuda na reutilização de código. Métodos abstratos devem ser implementados nas classes filhas, por justamente pelo uso da herança, e se não causa um erro na sintaxe. Eles não tem corpo ou implementação e sim uma assinatura (visibilidade, returno , nome do método e parâmetros.
* Quando uma classe tem métodos abstrados deve ser tornar abstrata. Não pode invocar diferamente os métodos abstratos da classe abstrata nas classes filhas, pois elas não tem implementacão.
```
public abstract double getBonificacao();
```
* Classes abstratas justamente por estar liga a reutilização de código e poliformorfismo que é usada em herança, conforme ao primeiro e segundo tópico.
* Não podem ser instanciadas.

### Interfaces
* Interface é um contrato que é diferente de herança e pode ser implementado mais de uma vez em uma classe. Pode parecer uma classe abstrata, todos os métodos abstratos, mas não pode conter nada concreto no interior, como atributos e implementações de métodos. Além de que a classe abstrata não pode ter mais de uma implementação na classe filha. O uso de interfaces pode ter repetição de código, então devemos ter cuidado ao pensar como usar a implementação para resultar em usa funcionalidade que faça sentido para a nossa classe, afim de não ocasionar repetição.
* No caso de repetição, podemos fazer o uso de <b>composição</b> e manter o código de funcionalidades da interface implementada em uma classe util a essas classes que fazem uso dela, possibilitando a reutilização de código.
* Tanto como classes abstratas tanto como interfaces não podem ser instanciadas.

### Anotaçoes em Java
* Podesse definifir metadados dentro de classes, e um forma configuração.
* com '@' em o nome da anotação. 
* Tipos de anotações são: marcadoras, valor único e completas.
* Marcadoras, não possuem membros, são identificados pela nome e sem dados adicionais. Exemplo: <b>@Test</b> do Junit.
* Valor único, parecida com as marcadoras, possuem um único membro, no qual é chamado o valor. São representadas com a anotacão e valor. Exemplo, <b>@displayName("Nome")</b>.
* Completas, possuem muitos membros separados por vírgula. <b>@Version(local=0.1,web=3.0)</b>.

<p>* Anotação marcador</p>

```

@interface Marcar {
  
}

```

<p>* Anotação</p>

```

@interface Pessoa_dados {
  String nome();
  String endereco();
}

```

<p> Chamando a anotação<p>

```
@Pessoas_dados(nome="Flavio Cardos", endero="Brasil")
```

<p>* Por default</p>

```

@interface Pessoa_dados {
  String nome() default "Insira o nome";
  String endereco() default "Insira o endereco";
}

```

<p>Chamando a anotação</p>

```

@Pessoas_dados

```

