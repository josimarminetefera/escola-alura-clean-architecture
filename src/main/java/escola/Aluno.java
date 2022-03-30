package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	// Entidade
	// Jpa = O espelho do banco de dados o dominio
	// Celan Arquitecture = Camada de regra de negócio
	// Classe que tenha um atributo que identifique unicamente o objeto.

	private Cpf cpf;
	private String nome;
	private Email email;

	private List<Telefone> telefones = new ArrayList<Telefone>();

	public void adicionarNovoTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public Cpf getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public Email getEmail() {
		return email;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

}
