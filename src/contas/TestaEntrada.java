package contas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



//classe para criação de arquivos//
public class TestaEntrada {
	
	public static void main(String[] args) {
		InputStream is = System.in;
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr); 
		System.out.println("Digite sua mensagem:"); 
		String linha = null;
		try {
			linha = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // primeira linha 
		while (linha != null) 
		System.out.println(linha);
		try {
			linha = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
	

}
