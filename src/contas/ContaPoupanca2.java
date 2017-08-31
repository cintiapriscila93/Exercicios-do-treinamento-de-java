package contas;

public class ContaPoupanca2 extends Conta2 {

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;

	}

}
