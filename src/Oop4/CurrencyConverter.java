package Oop4;

public class CurrencyConverter {
    private double exchangeRate;
    private double amountToBeBought;

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public void setAmountToBeBought(double amountToBeBought) {
        this.amountToBeBought = amountToBeBought;
    }

    public double conversion() {
            double tax = (double) 6 / 100;
            double computeValue = exchangeRate * amountToBeBought;
            return computeValue + computeValue * tax;
    }

    public boolean isValid() {
        return exchangeRate > 0 && amountToBeBought > 0;
    }

    public void promptInfo() {
        if (!isValid()) {
            System.out.println("Invalid input");
        } else {
            System.out.println("With the Exchange Rate rate of: " + exchangeRate);
            System.out.printf("The amount to be paid in reais will be:%.2f%n ", conversion());
        }
    }
}


