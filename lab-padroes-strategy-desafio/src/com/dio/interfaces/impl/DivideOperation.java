package com.dio.interfaces.impl;

import com.dio.interfaces.Operation;

public class DivideOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
    	return num1 / num2;
    }
}
