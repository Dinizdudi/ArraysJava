package br.com.senac.array;

/**
 * @author Eduardo Diniz
 *
 */
public class Array1 {
	public static void main(String[] args) {
		System.out.println("Array simples");
		System.out.println("");
		System.out.println("Exemplo 1: sem array");
		
		System.out.println("");
		System.out.println("Exemplo 2: sem array");
		System.out.println("");
		//a linha abaixo cria um array simples de tamanho 4
		String[] times = {"Palmeiras", "Corinthians", "São Paulo", "Santos"};
		System.out.println("Time: " + times[1]);
		System.out.println("");
		System.out.println("Exemplo 3: Modificando um conteudo do array");
		times[1] = "Flamengo";
		System.out.println("Time: " + times[1]);
		System.out.println("");
		System.out.println("Tamanho do array: " + times.length);
		
	}
}
