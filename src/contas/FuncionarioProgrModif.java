package contas;

public class FuncionarioProgrModif {

	String nome;
	double departamento;
	Data dataEntrada;
	String rg;
	double salario;

	void recebeAumento(double valor) {
		this.salario += valor;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {

		int dia = this.dataEntrada.dia;
		int mes = this.dataEntrada.mes;
		int ano = this.dataEntrada.ano;

		System.out.println("Nome:" + this.nome);
		System.out.println("Departamento:" + this.departamento);
		System.out.println("Data de entrada:" + dia + "/" + mes + "/" + ano);
		System.out.println("Rg:" + this.rg);
		System.out.println("Salario:" + this.salario);
		System.out.println("Dia:" + this.dataEntrada.dia);
		System.out.println("Mes:" + this.dataEntrada.mes);
		System.out.println("Ano:" + this.dataEntrada.ano);
	}

}
