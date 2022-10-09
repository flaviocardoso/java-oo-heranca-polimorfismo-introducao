# Java OO - Herança e Polimorfismo introdução
Relembrando conceitos de Herança e Polimorfismo.

## Visibidade e acoplamento
* private - tem menor visilibidade. Somente sendo acessado na própria classe.
* protected - tem uma função parecida com a private mas pode ser acessada pelas classes filhas. (Relacionado a herança de classes)
* public - visível em todo lugar lugar.

## Idéia de Herança
* Uma classe pode ter várias filhas, mas apenas uma mãe.
* Dado uma instância de uma classe podemos chamar qualquer método público que tenha sido declarado na classe mãe.
* Classe mãe pode ser chamada de super ou base class.
* Classe filha pode ser chamada de sub class.

* Podemos ter acesso a atribulos ou métodos através da palavra chave super que acessa a classe mãe, não podemos utilizar o this.
* Não recebemos os contrutores.

## Princípios da Herança
* Reutilização de código.
* Polimorfismo - O tipo de referência de classes mais genérica que referenciam objectos mais específicos. Pode ser uso de classes genérica, com a super class, ou a utilização de interfaces.

Objetos não mudam de tipo, mas a referência pode mudar. O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto.
O Uso de referências mais genéricas permite desacoplar sistemas.
