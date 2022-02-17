package exerciciosEstruturaCondicional;

import java.util.Scanner;

public class CalculadoraCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double resultado;

		System.out.println("Digite o primeiro numero");
		double n1 = sc.nextDouble();

		System.out.println("digite o segundo numero?");
		double n2 = sc.nextDouble();

		System.out.println("qual a operação? 1-adição, 2-subtração, 3-multiplicação, 4-divisão");
		int resposta = sc.nextInt();

		switch (resposta) {

		case 1:
			resultado = n1 + n2;
			System.out.println(" o resultado eh: " + resultado);
			break;

		case 2:
			resultado = n1 - n2;
			System.out.println(" o resultado eh: " + resultado);
			break;

		case 3:
			resultado = n1 * n2;
			System.out.println(" o resultado eh: " + resultado);
			break;

		case 4:
			resultado = n1 / n2;
			System.out.println(" o resultado eh: " + resultado);
			break;

		default:
			System.out.println("opção invalida");
		}
	}

}
