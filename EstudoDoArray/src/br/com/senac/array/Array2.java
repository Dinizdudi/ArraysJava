package br.com.senac.array;

import java.util.Random;

/**
 * @author Eduardo Diniz
 *
 */
public class Array2 {
	public static void main(String[] args) {
		String[] nipes = { "♣", "♥", "♠", "♦" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		Random sorteio = new Random();
		int rnipe = sorteio.nextInt(nipes.length);
		int rface = sorteio.nextInt(faces.length);
		System.out.println("A carta randomizada é um: " + faces[rface] + "" + nipes[rnipe]);
	}
}
