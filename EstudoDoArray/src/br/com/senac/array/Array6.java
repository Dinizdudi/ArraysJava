package br.com.senac.array;

import java.util.Arrays;

/**
 * @author Eduardo Diniz
 *
 */
public class Array6 {
	public static void main(String[] args) {
		String[] times = { "Santos", "Palmeiras", "Corinthians", "São Paulo", "Portuguesa" };
		System.out.println(Arrays.toString(times));// faz a Array virar uma string com todos os indices
		//Usando a classe Arrays para ordenar o conteudo do array
		//Arrays.sort(nome_array, inicio, final
		System.out.println("Time: " + times[0]);
		Arrays.sort(times, 0, times.length); //ordena mudando a ordem dos indices
		System.out.println(Arrays.toString(times));
		System.out.println("Time: " + times[0]);
	}
}
