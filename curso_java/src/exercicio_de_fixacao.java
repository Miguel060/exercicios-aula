
public class exercicio_de_fixacao {

	public static void main(String[] args) {
		String product1 = "Computador";
		String product2 = "Office desk";
	int age = 30;
	int code = 5290;
	char gender = 'f';
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.printf("PRODUTOS:%n %s: seu preço é R$ %.1f reais",product1, price1);
	System.out.printf("%n %s: seu preço é R$ %.2f reais%n registro: ",product2, price2);
	System.out.printf("%d anos de idade, código %s e " + gender, age, code);
	System.out.printf("%n %.8f medida com oito casa decimais:", measure);
	System.out.printf("%n %.3f medida com três casas decimais:", measure);
	
	}

}
