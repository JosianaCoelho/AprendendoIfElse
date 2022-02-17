package desafioDeProgramacao;

import java.util.Scanner;

public class SenhaForte {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String senha;

		System.out.println("digite uma senha forte:");
		senha = sc.nextLine();

		System.out.println("Adicione " + senha.length() + " caracteres");

		sc.close();
	}
}
