package classes.empregados.abstrato;

import classes.empregados.Bonificacao;

public class EditorVideo extends Funcionario implements Bonificacao {
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * super.getTaxaBonificacao() + 100;
	}
}
