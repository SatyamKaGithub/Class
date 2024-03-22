import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine(); // This line is added

        String[] strings = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine().trim(); // Read and trim each string
        }

        Arrays.sort(strings); // Use built-in sort for efficiency

        System.out.println("Strings in dictionary order:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}