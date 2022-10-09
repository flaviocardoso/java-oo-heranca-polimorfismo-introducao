package classes.empregados;

public class EditorVideo extends Funcionario implements Bonificacao {
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}
}
