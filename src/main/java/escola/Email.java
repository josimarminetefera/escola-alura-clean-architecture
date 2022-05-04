package escola;

// N�o � Entidade pois n�o tem nada que diferencia isso aqui � um VALUE OBJECT
public class Email {

	private String endereco;

	public Email(String endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Informe o E-mail!");
		}
		// "^[\\\\w\\\\.-]+@([\\\\w\\\\-]+\\\\.)+[A-Z]{2,4}$\""
		// "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$"
		// "(\\\\S.*\\\\S)(@)(\\\\S.*\\\\S)(.\\\\S[a-z]{2,3})"
		// "(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})"
		if (!endereco.matches("(\\S.*\\S)(@)(\\S.*\\S)(.\\S[a-z]{2,3})")) {
			throw new IllegalArgumentException("E-mail inv�lido!");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return this.endereco;
	}

}
