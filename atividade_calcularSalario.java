package data;
import java.util.Scanner;
import java.util.Locale;
public class atividade_calcularSalario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horas;
	    double valorHora, salario;
		
	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();
		
	    salario = valorHora * horas;
		
	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
	    
	    sc.close();
	}    
}
