import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
    public static double calculateGrossPrice(double netPriceWithTaxes, double taxRate) {
        double grossPriceBeforeTaxes = netPriceWithTaxes / (1 + taxRate);
        return grossPriceBeforeTaxes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter net price including taxes: ");
        double netPrice = scanner.nextDouble();
        System.out.print("Enter tax rate in percent: ");
        double taxRate = scanner.nextDouble();

        double grossPrice = calculateGrossPrice(netPrice, taxRate);
        System.out.println("Gross price before taxes: " + String.format("%.2f", grossPrice));
    }
}
