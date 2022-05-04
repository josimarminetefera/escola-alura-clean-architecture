package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecoInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("invalido"));
	}

	@Test
	void deveriaPermitirCriarEmailComDadosCorretos() {
		String endereco = "josimaminete@gmail.com";
		Email email = new Email(endereco);
		assertEquals(email.getEndereco(), "josimaminete@gmail.com");
	}

}
