package escola;

// N�o � Entidade pois n�o tem nada que diferencia isso aqui � um VALUE OBJECT
public class Email {

	private String endereco;

	public Email(String endereco) {
		if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
			throw new IllegalArgumentException("E-mail inv�lido!");
		}
		this.endereco = endereco;
	}

}
