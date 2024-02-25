import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the rate of retail inflation (in percentage)
        System.out.print("Enter the rate of retail inflation (in percentage): ");
        double rateOfInflation = scanner.nextDouble() / 100;

        // Input the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Calculate the compounded retail inflation
        double compoundedInflation = Math.pow(1 + rateOfInflation, numberOfYears);

        long roundedInflation = Math.round((compoundedInflation - 1) * 100);

        // Display the rounded compounded retail inflation
        System.out.println("Compounded retail inflation after " + numberOfYears + " years: " + (double)roundedInflation+ "%");


        scanner.close();
    }

}
