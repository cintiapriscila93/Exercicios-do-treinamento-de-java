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
			System.out.println("Meu nome " + cintia[10] + " � um pal�ndromo.");

		} else {
			System.out.println("Meu nome " + cintia[10] + " n�o � um pal�ndromo.");
		}

	}

}
