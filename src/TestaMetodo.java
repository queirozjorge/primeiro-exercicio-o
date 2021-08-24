
public class TestaMetodo {

	public static void main(String[] args) {

		// Cadastro primeiro cliente.
		Endereco enderecoTeste = new Endereco("33", "Rua", "Bairro das Rosas");
		Cliente clienteTeste = new Cliente("Teste", "333.333.333-03", enderecoTeste);
		Conta contaTeste = new Conta(2290, 13506, clienteTeste);
		contaTeste.setTitularConta(clienteTeste);

		// Cadastro de um segundo cliente.
		Endereco enderecoJorge = new Endereco("22", "Rua", "Bairro das Margaridas");
		Cliente clienteJorge = new Cliente("Jorge", "222.222.222-02", enderecoJorge);
		Conta contaJorge = new Conta(1234, 98765, clienteJorge);
		contaJorge.setTitularConta(clienteJorge);

		// Total de contas j� criadas.
		System.out.println("Total de contas criadas: " + Conta.getTotalContasCriadas());

		// M�todo deposita.
		contaJorge.deposita(10000);
		contaTeste.deposita(15000);

		//M�todos saca e transfere aproveitando o boolean devolvido.
		if (contaJorge.saca(2000)) {
			System.out.println("Sacou!");
		} else {
			System.out.println("Sem saldo suficiente!");
		}

		if (contaTeste.saca(2000)) {
			System.out.println("Sacou!");
		} else {
			System.out.println("Sem saldo suficiente!");
		}

		if (contaJorge.transfere(2000, contaTeste)) {
			System.out.println("Transferiu!");
		} else {
			System.out.println("Sem saldo suficiente!");
		}

		//Valida��o das transa��es realizadas.
		System.out.println("Saldo atual da conta Jorge: " + contaJorge.getSaldo()); // Dever� sobrar 6000
		System.out.println("Saldo atual da conta Teste: " + contaTeste.getSaldo()); // Dever� ter 15000

		// Testando getters e refer�ncias.
		System.out.println("Nome titular: " + contaJorge.getTitularConta().getNome());
		System.out.println("Numero resid�ncia: " + contaJorge.getTitularConta().getEndereco().getNumero());
		System.out.println("Logradouro: " + contaJorge.getTitularConta().getEndereco().getLogradouro());

	}
}
