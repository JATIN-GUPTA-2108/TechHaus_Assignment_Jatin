import java.util.Scanner;

public class problem6 {
    // Method to find the string with the most vowels in an array of strings
    public static String findStringWithMostVowels(String[] strings) {
        String maxVowelString = "";
        int maxVowels = 0;

        // Iterate through each string in the array
        for (String str : strings) {
            // Count the number of vowels in the current string
            int vowelsCount = countVowels(str);

            // Update the maximum number of vowels and the corresponding string if needed
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                maxVowelString = str;
            }
        }

        return maxVowelString;
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to simplify the vowel check
        for (char ch : str.toLowerCase().toCharArray()) {
            // Check if the character is a vowel and increment the count if it is
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Input the strings
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Find the string with the most vowels
        String mostVowelsString = findStringWithMostVowels(strings);

        // Display the result
        System.out.println("String with most vowels: " + mostVowelsString);

        scanner.close();
    }
}
