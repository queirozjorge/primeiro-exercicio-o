
/* Classe endereço, permite a criação de objetos com estes atributos
 Como na classe Cliente, não houve necessidade de criar setters */
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
