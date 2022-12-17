import java.util.Scanner;

public class WhileExercicios2 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		double senha;
		senha = sc.nextDouble();
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextDouble();	
		};
		System.out.println("Acesso Permitido");
		sc.close();
		
		
		sc.close();	}
}