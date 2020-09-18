/**
 * 
 */
package ecommerce.model;

/**
 * @author marcio
 *
 */
public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private boolean ativo = false;

	public Cliente(String nome, String email, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public void setAtivo() {
		this.ativo = true;
	}

}
