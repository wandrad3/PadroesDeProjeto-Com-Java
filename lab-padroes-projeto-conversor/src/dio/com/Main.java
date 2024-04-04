package dio.com;

import java.util.Scanner;

import dio.com.utils.CurrencyAdapter;
import dio.com.utils.OldCurrencyConverter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        OldCurrencyConverter oldConverter = new OldCurrencyConverter();
        CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);

        // Converter USD para EUR usando o adaptador
        double eurAmount = adapter.convertUSDtoEUR(input);

        System.out.println("USD: " + input);
        System.out.println("EUR: " + eurAmount);

    }
}