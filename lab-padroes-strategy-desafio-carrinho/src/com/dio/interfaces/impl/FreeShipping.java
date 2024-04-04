package com.dio.interfaces.impl;

import com.dio.interfaces.DiscountStrategy;

public class FreeShipping implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        System.out.println("Frete gratis aplicado");
        return total;
    }
}