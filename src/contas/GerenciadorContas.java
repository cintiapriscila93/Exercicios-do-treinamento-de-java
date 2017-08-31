package contas;

public class GerenciadorContas {

	public static void main(String[] args) {
		Conta conta = new Conta("Bruno", "8777", "123456");
		conta.deposita(100);
		conta.saca(10);

		System.out.println("saldo atual:" + conta.getValor());

	}

}
