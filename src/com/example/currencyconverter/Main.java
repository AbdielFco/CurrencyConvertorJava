package com.example.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter amount in USD:");
            double amount = scanner.nextDouble();

            System.out.println("Enter target currency (e.g., EUR, JPY, DOP, USD):");
            String targetCurrency = scanner.next().toUpperCase();

            CurrencyConverter converter = new CurrencyConverter();
            double convertedAmount = converter.convert(amount, "USD", targetCurrency);

            if (convertedAmount != -1) {
                System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrency);
            } else {
                System.out.println("Invalid target currency.");
            }
        }
    }
}
