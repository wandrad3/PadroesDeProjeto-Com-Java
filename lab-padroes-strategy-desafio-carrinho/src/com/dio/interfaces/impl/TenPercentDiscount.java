package com.dio.interfaces.impl;

import com.dio.interfaces.DiscountStrategy;

public class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}
