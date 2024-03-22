/*Write java code read a word check if it is in uppercase the convert it into lowercase
   and lowercase to uppercase without using string function.*/

import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String word = input.nextLine();
        System.out.println(convertCase(word));
    }

    public static String convertCase(String word) {
        StringBuilder convertedWord = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {  // Pass the character 'c' to the method
                convertedWord.append((char) (c + 'A' - 'a'));
            } else if (Character.isUpperCase(c)) {  // Similarly for uppercase check
                convertedWord.append((char) (c - 'A' + 'a'));
            } else {
                convertedWord.append(c);
            }
        }
        return convertedWord.toString();
    }
}
