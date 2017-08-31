package contas;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();

		f1.nome = "Hugo";
		f1.departamento = "TI";
		f1.rg = "492635742";
		f1.dataEntrada = "10/02/2015";
		f1.dataSaida = "10/08/2017";
		f1.salario = 1300;
		f1.recebeAumento(200);

		System.out.println("nome:" + f1.nome);
		System.out.println("departamento:" + f1.departamento);
		System.out.println("rg:" + f1.rg);
		System.out.println("data de entrada:" + f1.dataEntrada);
		System.out.println("data de saida:" + f1.dataSaida);
		System.out.println("salario atual:" + f1.salario);
		System.out.println("ganho anual:" + f1.calculaGanhoAnual());

	}

}
