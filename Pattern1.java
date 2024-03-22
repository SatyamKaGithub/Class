import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String word = input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1));
        }
    }
}

