package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x = sc.nextInt();
		System.out.println("O valor inserido foi: "+ x );
	
	
	
	sc.close();
	}

}
