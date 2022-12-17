
import java.util.Scanner;

public class exercicios2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inteiro;
		inteiro = sc.nextInt();
		
		if(inteiro < 0) {
			System.out.printf("Numero negativo: "+ inteiro);
		}
		else if (inteiro >0) {
				
				System.out.printf("Numero positivo: "+ inteiro);
			sc.close();	
			}
		}

	}
