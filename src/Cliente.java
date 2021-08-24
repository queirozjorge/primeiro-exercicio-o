
/* Classe cliente, permite a criação de objetos do tipo cliente.
Não houve necessidade de criar setters, visto que durante a criação da classe, o construtor obriga a inserção destes dados. */
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
