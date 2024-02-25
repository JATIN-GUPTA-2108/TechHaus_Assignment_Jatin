import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of seconds
        System.out.print("Enter the number of seconds: ");
        long totalSeconds = scanner.nextLong();

        // Calculate days, hours, minutes, and seconds
        long days = totalSeconds / (24 * 3600);
        long remainingSeconds = totalSeconds % (24 * 3600);
        long hours = remainingSeconds / 3600;
        remainingSeconds %= 3600;
        long minutes = remainingSeconds / 60;
        long seconds = remainingSeconds % 60;

        // Display the time equivalent
        System.out.println(totalSeconds + " Second(s) is equivalent to:");
        System.out.println(days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)");

        scanner.close();
    }
}
