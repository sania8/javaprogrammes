import java.util.Scanner;
public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (e.g., C 37 or F 98.6): ");
        String input = sc.nextLine().trim();
        sc.close();

        char unit = input.charAt(0);
        double value = Double.parseDouble(input.substring(2));

        double result;
        if (unit == 'C' || unit == 'c') {
            result = celsiusToFahrenheit(value);
            System.out.printf("Converted temperature: %.1f%n", result);
        } else if (unit == 'F' || unit == 'f') {
            result = fahrenheitToCelsius(value);
            System.out.printf("Converted temperature: %.1f%n", result);
        } else {
            System.out.println("Invalid input format. Please use 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
