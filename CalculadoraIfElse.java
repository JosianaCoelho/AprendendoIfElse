package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class CalculadoraIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double resultado;

		System.out.println("digite o primeiro numero?");
		double n1 = sc.nextDouble();

		System.out.println("digite o segundo numero?");
		double n2 = sc.nextDouble();

		System.out.println("qual a operação? 1-adição, 2-subtração, 3-multiplicação, 4-divisão");
		int op = sc.nextInt();

		if (op == 1) {
			resultado = n1 + n2;
			System.out.println(" o resultado eh: " + resultado);
		}

		else if (op == 2) {
			resultado = n1 - n2;
			System.out.println(" o resultado eh: " + resultado);
		}

		else if (op == 3) {
			resultado = n1 * n2;
			System.out.println(" o resultado eh: " + resultado);
		}

		else if (op == 4) {
			resultado = n1 / n2;
			System.out.println(" o resultado eh: " + resultado);
		}

		else {
			System.out.println("opção invalida");
		}

		sc.close();

	}

}
