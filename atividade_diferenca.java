package data;

import java.util.Scanner;

public class atividade_diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A * B - C * D);
		
		System.out.println(dif);
		sc.close();
	}

}
