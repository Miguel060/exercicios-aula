package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			} else
			{

			}sc.close();
		}
	}
}
