package contas;

public class ContaCorrente2 extends Conta2 {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;

	}

}
