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
		System.out.println("N�mero " + impares [3]);
		impares[3] = 11;
		System.out.println("N�mero " + impares[3]);
		impares[5] = 13;//n�o d� pra fazer isso j� que a array foi criada como objeto ent�o tem um tamanho limitado
	}
}
