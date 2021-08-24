
public class Conta {

	private double saldo;
	private int agencia;
	private int numeroConta;
	private Cliente titularConta;
	private static int totalContasCriadas; //Método static, permite somar a quantidade de contas abertas dentro da classe.

	//Construtor solicita algumas informações básicas para criar a conta.
	public Conta(int agencia, int numeroConta, Cliente titularConta) {

		System.out.println("Uma conta foi criada! Agência: " 
							+ agencia + ". Conta número: " + numeroConta
									+ ". Nome titular: " + titularConta.getNome());
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		Conta.totalContasCriadas++;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	//Somente realiza saque se houver dinheiro na conta e o valor solicitado for menor do que o existente em saldo.
	public boolean saca(double valor) {
		if (valor <= this.saldo && this.saldo > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	//Lógica parecida com o método saca
	public boolean transfere(double valor, Conta destinatario) {
		if (valor <= this.saldo && this.saldo > 0) {
			this.saca(valor);
			destinatario.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public static int getTotalContasCriadas() {
		return Conta.totalContasCriadas;
	}

	public Cliente getTitularConta() {
		return this.titularConta;
	}
	
	public void setTitularConta(Cliente titularConta) {
		this.titularConta = titularConta;
	}
}
