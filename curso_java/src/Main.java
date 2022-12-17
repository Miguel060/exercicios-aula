
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
	String nome = "Maria";
	int idade = 31;
	double renda = 4.000;
	double y = 10.6789;	
		System.out.println(y);
		System.out.printf("%.3f%n" , y);
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n" , y);
		System.out.println("Resultado = " +y+ " Metros ");
		System.out.printf("Resultado = %.2f Metros%n", y);
		System.out.printf(" %s tem %d anos e recebe R$ %.3f reais por mês%n", nome, idade, renda);
		
	
	

	}

}
