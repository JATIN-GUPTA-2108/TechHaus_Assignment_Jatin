import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input taxable income
        System.out.print("Enter the taxable income: ");
        double income = scanner.nextDouble();
        
        double tax = 0.0;
        // Calculate tax based on income slabs
        if (income <= 250000) {
            tax = 0.0; // No tax for income less than or equal to 250000
        } else if (income <= 500000) {
            tax = 0.1 * (income - 250000); // 10% tax on income between 250001 and 500000
        } else if (income <= 1000000) {
            // 10% tax on income between 250001 and 500000
            // 20% tax on income between 500001 and 1000000
            tax = 0.1 * (500000 - 250000) + 0.2 * (income - 500000);
        } else {
            // 10% tax on income between 250001 and 500000
            // 20% tax on income between 500001 and 1000000
            // 30% tax on income greater than 1000000
            tax = 0.1 * (500000 - 250000) + 0.2 * (1000000 - 500000) + 0.3 * (income - 1000000);
        }
        
        // Display the calculated income tax
        System.out.println("Income Tax: Rs. " + tax);
        
        scanner.close();
    }
}
