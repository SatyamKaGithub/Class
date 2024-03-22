import java.util.Scanner;

/*Write java code to read a sentence from the user and print its acrobatic.
          Hint :
          Input : Satyam Kumar
          Output : SK*/
import java.util.Scanner;

public class Acrobatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Acrobatic: " + getAcrobatic(sentence));
    }
    public static String getAcrobatic(String sentence) {
        StringBuilder acrobatic = new StringBuilder();
        boolean isStartOfWord = true;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c) && isStartOfWord) {
                acrobatic.append(Character.toUpperCase(c)); // Add uppercase first letter
                isStartOfWord = false;
            } else if (Character.isWhitespace(c)) {
                isStartOfWord = true; // Reset for next word
            }
        }
        return acrobatic.toString();
    }
}

