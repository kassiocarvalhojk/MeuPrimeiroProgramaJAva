/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;
/**
 * @author kassiocarvalho
 *
 */
public class Princiopal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Olá amigo!\nQual o seu nome?");
		
		Scanner in  = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Olá %s!\n", nome);

	}

}
