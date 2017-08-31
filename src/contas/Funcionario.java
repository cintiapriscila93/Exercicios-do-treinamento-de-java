package contas;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String dataSaida;
	String rg;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}
}