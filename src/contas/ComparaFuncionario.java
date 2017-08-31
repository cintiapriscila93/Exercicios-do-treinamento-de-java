package contas;

public class ComparaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Cintia";
		f1.salario = 1000;

		Funcionario f2 = new Funcionario();
		// resultado iguais//
		f2 = f1;
		f2.nome = "Cintia";
		f2.salario = 1000;
		// resultado diferentes//
		// if (f2 == f1) {
		System.out.println("iguais!");
		// } else {
		// System.out.println("diferentes!");
	}
}
// }

// Apesar dos valores atribuidos serem iguais o resultado será diferente pois
// existem objetos diferentes instanciados//
// Se eu colocar no programa abaixo f1= f2, o resultado será iguais pois eu
// estou atribuindo o f1 ao f2.//
