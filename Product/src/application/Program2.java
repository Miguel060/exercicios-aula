package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
			System.out.print("Name: ");
		String name = sc.nextLine();
			System.out.print("Price: ");
		double price = sc.nextDouble();
			System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		product.setName("videogame");
			System.out.println("Updated name: " + product.getName());
			System.out.println();
			System.out.println("product data: " + product);
			System.out.println();
			System.out.println("Enter the numbers of products to be added in stock ");
			quantity = sc.nextInt();
		product.addProducts(quantity);
			System.out.println();
			System.out.println("Update data: " + product);
			System.out.println();
			System.out.println("Enter the numbers of products to be removed in stock ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
			System.out.println();
			System.out.println("Update data: " + product);
		sc.close();
	}

}
