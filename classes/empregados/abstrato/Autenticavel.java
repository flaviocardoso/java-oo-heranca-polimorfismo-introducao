package classes.empregados.abstrato;

public interface Autenticavel {
	public void setSenha(int senha);
	public boolean autentica(int senha);
}
