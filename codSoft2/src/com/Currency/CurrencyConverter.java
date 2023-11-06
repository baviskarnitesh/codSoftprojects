package com.Currency;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed exchange rates (base currency: USD)
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.73;
        double usdToJpyRate = 112.5;

        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Select your base currency:");
        System.out.println("1. USD (U.S. Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Enter your choice: ");

        int baseCurrencyChoice = scanner.nextInt();
        double baseRate;

        switch (baseCurrencyChoice) {
            case 1:
                baseRate = 1.0; // Base currency is USD
                break;
            case 2:
                baseRate = usdToEurRate; // Base currency is EUR
                break;
            case 3:
                baseRate = usdToGbpRate; // Base currency is GBP
                break;
            case 4:
                baseRate = usdToJpyRate; // Base currency is JPY
                break;
            default:
                System.out.println("Invalid choice. Using USD as the base currency.");
                baseRate = 1.0;
        }

        System.out.println("Select your target currency:");
        System.out.println("1. USD (U.S. Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Enter your choice: ");

        int targetCurrencyChoice = scanner.nextInt();
        double targetRate;

        switch (targetCurrencyChoice) {
            case 1:
                targetRate = 1.0; // Target currency is USD
                break;
            case 2:
                targetRate = usdToEurRate; // Target currency is EUR
                break;
            case 3:
                targetRate = usdToGbpRate; // Target currency is GBP
                break;
            case 4:
                targetRate = usdToJpyRate; // Target currency is JPY
                break;
            default:
                System.out.println("Invalid choice. Using USD as the target currency.");
                targetRate = 1.0;
        }

        System.out.print("Enter the amount to convert: ");
        double amountToConvert = scanner.nextDouble();

        double convertedAmount = amountToConvert * (targetRate / baseRate);

        System.out.println("Converted amount: " + convertedAmount + " " + getCurrencySymbol(targetCurrencyChoice));

        scanner.close();
    }

    private static String getCurrencySymbol(int currencyChoice) {
        switch (currencyChoice) {
            case 1:
                return "USD";
            case 2:
                return "EUR";
            case 3:
                return "GBP";
            case 4:
                return "JPY";
            default:
                return "USD"; // Default to USD symbol
        }
    }
}
