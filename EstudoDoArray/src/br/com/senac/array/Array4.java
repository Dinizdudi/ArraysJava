package br.com.senac.array;

/**
 * @author Eduardo Diniz
 *
 */
public class Array4 {
	public static void main(String[] args) {
		int[] dezenas = new int[10];
		for (int i = 0; i < dezenas.length; i++) {
			dezenas[i] = i * 10;
			System.out.println("dezena[" + i + "] = " + dezenas[i]);
		}
	}
}
