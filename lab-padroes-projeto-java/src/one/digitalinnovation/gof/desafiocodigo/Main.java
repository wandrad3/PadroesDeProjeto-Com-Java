package one.digitalinnovation.gof.desafiocodigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final List<User> users = new ArrayList<>();


	// TODO: Implementar o padrão Singleton para garantir que haja apenas uma
	// instância do gerenciador de usuários

	public static void addUser(String name) {

		UserManager.getInstance().addUser(name);
	}

	public static void listUsers() {

		UserManager.getInstance().listUsers();

	}

	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int quantity = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

		for (int i = 1; i <= quantity; i++) {
			String name = scanner.nextLine();
			addUser(name);
		}

		listUsers();
	}
}
