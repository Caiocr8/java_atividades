package data;

import java.util.Scanner;

public class atividade_soma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		System.out.println("DIGITE O PRIMEIRO NUMERO:");
		A = sc.nextInt();
		System.out.println("DIGITE O SEGUNDO NUMERO:");
		B = sc.nextInt();
		
		soma = A + B;
		
		System.out.println("A SOMA É :" + soma);
		sc.close();
	}

}
