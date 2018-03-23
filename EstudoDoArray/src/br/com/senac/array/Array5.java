package br.com.senac.array;

/**
 * @author Eduardo Diniz
 *
 */
public class Array5 {
	public static void main(String[] args) {
		int pares[] = { 2, 4, 6, 8 };
		for (int i = 0; i < pares.length; i++) {
			System.out.println("Pares[" + i + "]=" + pares[i]);
		}
		System.out.println("");
		for (int i : pares) {
			System.out.println(i);//neste caso NAO usamos[]
		}
	}
}
