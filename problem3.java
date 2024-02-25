import java.util.Scanner;

public class problem3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Find the maximum of the two numbers
        double maxNumber = Math.max(firstNumber, secondNumber);

        // Display the maximum number
        System.out.println("The maximum number is: " + maxNumber);

        scanner.close();
    }



}
