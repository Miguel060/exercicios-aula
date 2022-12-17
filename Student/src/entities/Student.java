package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	

	public double mediaFinal() {
		return nota1 + nota2 + nota3;
	}
	public boolean pass() {
		return mediaFinal() >= 60.00;
	}
	

}
