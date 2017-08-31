package contas;

public class Conta extends Object {
	private String nome;
	private String agencia;
	private String conta;
	private double valor;
	private String digitoverificacao;
	protected int numero;

	public Conta(String nome, String agencia) {
		if (nome == null || nome.isEmpty()) {
			System.out.println("erro");
		}
		this.nome = nome;
		this.agencia = agencia;

	}

	public Conta(String nome, String agencia, String conta) {
		if (nome == null || nome.isEmpty()) {
			System.out.println("erro");
		}
		this.nome = nome;
		this.agencia = agencia;
		this.conta = conta;

	}

	public void saca(double valor) {
		this.valor -= valor;

	}

	public void deposita(double valor) {
		this.valor += valor;
	}

	public String getNome() {
		return nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getConta() {
		return conta;
	}

	public double getValor() {
		return valor;
	}

	public String getDigitoverificacao() {
		return digitoverificacao;
	}

	public void setDigitoverificacao(String digitoverificacao) {
		this.digitoverificacao = digitoverificacao;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "A conta do " + this.nome + "tem valor: " + this.valor;
	}

}
