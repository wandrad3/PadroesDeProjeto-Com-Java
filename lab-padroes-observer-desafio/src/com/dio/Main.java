package com.dio;

import java.util.Scanner;

import com.dio.interfaces.impl.Catalog;
import com.dio.interfaces.impl.User;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criando catálogo e usuário
		Catalog catalog = new Catalog();
		User user = new User("Usuário 1");

		// Inscricao do usuário no catálogo
		catalog.addObserver(user);

		// Adicionando novo produto
		String name = scanner.nextLine();
		String description = scanner.nextLine();
		double price = scanner.nextDouble();

		scanner.nextLine(); // Consumir a quebra de linha após nextDouble
		String subscribeChoice = scanner.nextLine();

		if (  subscribeChoice.toUpperCase().equals("N")) {
			catalog.removeObserver(user);
			System.out.println("Programa Encerrado.");
			return;
		}

		// Adicionando produto ao catálogo
		catalog.addProduct(name, description, price);
	}

}
