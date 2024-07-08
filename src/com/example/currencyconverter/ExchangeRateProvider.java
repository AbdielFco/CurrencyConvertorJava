package com.example.currencyconverter;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProvider {
    private final Map<String, Double> rates;

    public ExchangeRateProvider() {
        rates = new HashMap<>();
        rates.put("EUR", 0.85);
        rates.put("JPY", 110.0);
        rates.put("GBP", 0.75);
        rates.put("DOP", 56.5);  // Tasa de cambio del Peso Dominicano
        rates.put("USD", 1.0);  // Tasa de cambio del Dólar USA
        // Añade más tasas de cambio según sea necesario
    }

    public Map<String, Double> getRates() {
        return rates;
    }
}
