
/* Classe endere�o, permite a cria��o de objetos com estes atributos
 Como na classe Cliente, n�o houve necessidade de criar setters */
public class Endereco {

	private String numero;
	private String logradouro;
	private String bairro;

	public Endereco(String numero, String logradouro, String bairro) {

		this.numero = numero;
		this.logradouro = logradouro;
		this.bairro = bairro;
	}

	public String getNumero() {
		return this.numero;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public String getBairro() {
		return this.bairro;
	}

}
