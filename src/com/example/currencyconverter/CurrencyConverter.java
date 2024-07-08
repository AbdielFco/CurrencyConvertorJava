package com.example.currencyconverter;

import java.util.Map;

public class CurrencyConverter {
    private final ExchangeRateProvider rateProvider;

    public CurrencyConverter() {
        rateProvider = new ExchangeRateProvider();
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        Map<String, Double> rates = rateProvider.getRates();

        if (!rates.containsKey(toCurrency)) {
            return -1;
        }

        double rate = rates.get(toCurrency);
        return amount * rate;
    }
}
