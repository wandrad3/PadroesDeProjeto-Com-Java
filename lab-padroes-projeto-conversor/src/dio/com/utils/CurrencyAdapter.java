package dio.com.utils;

public class  CurrencyAdapter {
    private final OldCurrencyConverter oldConverter;

    public CurrencyAdapter(OldCurrencyConverter oldConverter) {
        this.oldConverter = oldConverter;
    }

    public double convertUSDtoEUR(double amount) {
       
        
        double eurAmount = amount * 0.85; // 1 GBP = 1.0625 EUR
        return eurAmount;
    }

}