

/*Write java code to read 2 lowercase string A and B each of length N, return True if they are
anagram otherwise false.
Hint : String 1 = bat        String 2 = tab
True, it is an Anagram.*/
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false; // Different lengths cannot be anagrams
        }

        int[] charCount = new int[26]; // Assuming all lowercase letters (a-z)

        for (char c : A.toCharArray()) {
            charCount[c - 'a']++; // Increment count for the character's index
        }

        for (char c : B.toCharArray()) {
            int index = c - 'a';
            if (charCount[index] == 0) {
                return false; // Character not found in A
            }
            charCount[index]--; // Decrement count for the character
        }

        // Check if all characters in A have corresponding counts in B
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string (lowercase): ");
        String A = scanner.nextLine();

        System.out.print("Enter the second string (lowercase): ");
        String B = scanner.nextLine();

        System.out.println(A + " and " + B + " are anagrams: " + isAnagram(A, B));
    }
}

