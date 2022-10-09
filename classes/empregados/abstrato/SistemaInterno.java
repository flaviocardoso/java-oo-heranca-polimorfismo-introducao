package classes.empregados.abstrato;

public class SistemaInterno {
	private int senha = 1312;
	
	public void autentica (Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Não pode entrar no sistema");
		}
	}
}
