# Java OO - Herança e Polimorfismo introdução
Relembrando conceitos de Herança e Polimorfismo.
<p></p>

## Visibidade
* private - tem menor visilibidade. Somente sendo acessado na própria classe.
* protected - tem uma função parecida com a private mas pode ser acessada pelas classes filhas. (Relacionado a herança de classes)
* public - visível em todo lugar lugar.
<p></p>

## Idéia de Herança
* Uma classe pode ter várias filhas, mas apenas uma mãe.
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
