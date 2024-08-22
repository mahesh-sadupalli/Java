import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the number of years left until the user turns 100
        int yearsToHundred = 100 - age;

        // Print the result
        System.out.println("Hello, " + name + "! You will turn 100 years old in " + yearsToHundred + " years.");

        // Close the scanner
        scanner.close();
    }
}
