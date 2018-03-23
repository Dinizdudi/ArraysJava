package br.com.senac.array;

/**
 * @author Eduardo Diniz
 *
 */
public class Array3 {
	public static void main(String[] args) {
		int[]impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		System.out.println("Número " + impares [3]);
		impares[3] = 11;
		System.out.println("Número " + impares[3]);
		impares[5] = 13;//não dá pra fazer isso já que a array foi criada como objeto então tem um tamanho limitado
	}
}
