
import java.util.Scanner;

public class exercicios {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double R, A, Pi = 3.14159;
		R = sc.nextDouble();
		A = Pi * R * R;
		System.out.printf("A= %.4f%n", A);

		sc.close();
	}
}