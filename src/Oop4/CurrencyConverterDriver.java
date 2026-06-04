package Oop4;

import java.util.Scanner;

public class CurrencyConverterDriver {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        currencyConverter.setExchangeRate(scanner.nextDouble());
        System.out.println("How many dollars will be bought? ");
        currencyConverter.setAmountToBeBought(scanner.nextDouble());
        currencyConverter.promptInfo();



        scanner.close();
    }
}
