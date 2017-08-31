package contas;

public class FatorialLong {

	public static void main(String[] args) {
		for (long n = 1, fatorial = 1; n <= 40; n++) {
			fatorial = fatorial * n;
			System.out.println("O fatorial de " + n + "! é igual a " + fatorial);
		}
	}
}
