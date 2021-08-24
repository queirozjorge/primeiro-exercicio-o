
/* Classe cliente, permite a cria��o de objetos do tipo cliente.
N�o houve necessidade de criar setters, visto que durante a cria��o da classe, o construtor obriga a inser��o destes dados. */
public class Cliente {

	private String nome;
	private String cpf;
	private Endereco endereco;

	public Cliente(String nome, String cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

}
