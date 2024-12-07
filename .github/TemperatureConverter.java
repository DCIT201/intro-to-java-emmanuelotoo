import java. util.Scanner; // importing scanner class for input

public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create a new scanner object

        System.out.println("Temperature Converter");
        System.out.print("1. Convert Celsius to Fahrenheit: ");
        System.out.print("2. Convert Fahrenheit to Celsius: ");

        // Ask the user for their choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt(); // Read the user's choice

        // Asking the user for thier temperature

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble(); // Reading the temperature

        if (choice == 1){
            double fahrenheit = temperature * 9/5 + 32;
            System.out.println("Celsius is " + fahrenheit + " Fahrenheit");

        } else if (choice == 2){
            double celsius = (temperature -32) * 5/9;
            System.out.println(temperature + "Fahrenheit is " + celsius + " Celsius");
        } else {
            System.out.println("Invalid choice. Try again.");
        }

        scanner.close(); // Close the scanner
    }
}