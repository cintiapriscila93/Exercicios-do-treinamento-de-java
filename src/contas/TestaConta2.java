package contas;

public class TestaConta2 {

	public static void main(String[] args) {

		Conta2 c = new Conta2();
		ContaCorrente2 cc = new ContaCorrente2();
		ContaPoupanca2 cp = new ContaPoupanca2();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
