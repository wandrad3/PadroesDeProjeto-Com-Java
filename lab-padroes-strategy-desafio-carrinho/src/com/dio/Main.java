package com.dio;

import java.util.Scanner;

import com.dio.interfaces.DiscountStrategy;
import com.dio.interfaces.impl.FreeShipping;
import com.dio.interfaces.impl.TenPercentDiscount;
import com.dio.model.ShoppingCart;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criando instâncias das estratégias de desconto
		DiscountStrategy tenPercentDiscount = new TenPercentDiscount();
		DiscountStrategy freeShipping = new FreeShipping();

		// Criando o carrinho de compras
		ShoppingCart cart = new ShoppingCart();

		// Adicionando produtos ao carrinho
		String productName = scanner.nextLine();
		double productPrice = scanner.nextDouble();
		cart.addProduct(productPrice);

		// Escolhendo a estratégia de desconto
		int strategyChoice = scanner.nextInt();

		// Configurando a estratégia no carrinho
		switch (strategyChoice) {
		case 1:
			cart.setDiscountStrategy(tenPercentDiscount);
			break;
		case 2:
			cart.setDiscountStrategy(freeShipping);
			break;
		default:
			System.out.println("Escolha invalida. Nenhum desconto aplicado.");
		}

		System.out.println("Total da compra: R$" + cart.calculateTotal());
		// TODO: Chamar o método calculateTotal e exibir o resultado
	}
}