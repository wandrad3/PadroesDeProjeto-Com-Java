package com.dio.model;

import java.util.ArrayList;
import java.util.List;

import com.dio.interfaces.DiscountStrategy;

public class ShoppingCart {

	 private List<Double> products = new ArrayList<>();
	    private DiscountStrategy discountStrategy;

	    public void addProduct(double price) {
	        products.add(price);
	    }

	    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
	        this.discountStrategy = discountStrategy;
	    }

	    public double calculateTotal() {
	    	double total = 0.0;
	    	for(double p : products) {
	    		total+=p;
	        }
	        return discountStrategy.applyDiscount(total);  // Retornar o total calculado
	    }
}
