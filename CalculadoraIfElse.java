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

		System.out.println("qual a opera��o? 1-adi��o, 2-subtra��o, 3-multiplica��o, 4-divis�o");
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
			System.out.println("op��o invalida");
		}

		sc.close();

	}

}
