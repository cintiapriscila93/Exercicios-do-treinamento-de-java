package contas;

public class Aumento {

	public static void main(String[] args) {
		FuncionarioProgrModif fichaFuncionario = new FuncionarioProgrModif();
		fichaFuncionario = new FuncionarioProgrModif();
		fichaFuncionario.nome = "Cintia Priscila";
		fichaFuncionario.departamento = 123.0;
		fichaFuncionario.rg = "492635742";
		fichaFuncionario.salario = 2400.25;
		fichaFuncionario.recebeAumento(50.00);
		fichaFuncionario.calculaGanhoAnual();

		System.out.println("Salario atual:" + fichaFuncionario.salario);
		System.out.println("Ganho anual:" + fichaFuncionario.calculaGanhoAnual());

		fichaFuncionario.dataEntrada = new Data();
		fichaFuncionario.dataEntrada.preencheData(25, 7, 2016);

		fichaFuncionario.mostra();

	}

}
