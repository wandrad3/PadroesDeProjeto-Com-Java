package com.dio;

import java.util.Scanner;

import com.dio.calculator.Calculator;
import com.dio.interfaces.Operation;
import com.dio.interfaces.impl.AddOperation;
import com.dio.interfaces.impl.DivideOperation;
import com.dio.interfaces.impl.MultiplyOperation;
import com.dio.interfaces.impl.SubtractOperation;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        Operation addOperation = new AddOperation();
        Operation subtractOperation = new SubtractOperation();
        Operation multiplyOperation = new MultiplyOperation();
        Operation divideOperation  = new  DivideOperation();
   

        // Criando a calculadora
        Calculator calculator = new Calculator();

        // Obtendo os números do usuário
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Obtendo a operação desejada
        String operationChoice = scanner.next();

        // Configurando a operação na calculadora
        switch (operationChoice) {
            case "+":
                calculator.setOperation(addOperation);
                break;
            case "-":
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                calculator.setOperation(divideOperation); // TODO: Utilizar a nova implementação de divisão
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        // Realizando a operação e exibindo o resultado
        double result = calculator.performOperation(num1, num2);
        System.out.println(result);

	}

}
