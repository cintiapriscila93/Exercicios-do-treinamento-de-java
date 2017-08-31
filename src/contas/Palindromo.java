package contas;

public class Palindromo {

	private char cintia[];

	public Palindromo(char p) {
	cintia = new char [10] ;

	}
	
	public void validaPalindromo() {

		String X = String.valueOf(cintia[10]);
		StringBuffer y = new StringBuffer(X);
		if (X.equals(y.reverse())) {
			System.out.println("Meu nome " + cintia[10] + " é um palíndromo.");

		} else {
			System.out.println("Meu nome " + cintia[10] + " não é um palíndromo.");
		}

	}

}
