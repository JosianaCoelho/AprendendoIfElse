package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class ParImparIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite um numero?");
		double numero = sc.nextDouble();

		double resto = numero % 2;

		if (resto == 0) {
			System.out.println("o numero é par");

		}

		else {
			System.out.println("o numero é impar");
		}
		sc.close();

	}

}
