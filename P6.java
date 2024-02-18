import java.util.Scanner;

public class P6 {
    private static final String[] units = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
            "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 9999): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 9999) {
            System.out.println("Please enter a number between 1 and 9999.");
        } else {
            String words = convertToWords(number);
            System.out.println("Number in words: " + words);
        }

        scanner.close();
    }
    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String result = "";

        if (number >= 1000) {
            result += units[number / 1000] + " Thousand ";
            number %= 1000;
        }

        if (number >= 100) {
            result += units[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number >= 20) {
                result += tens[number / 10] + " ";
                number %= 10;
            } else if (number >= 11) {
                result += teens[number - 10] + " ";
                number = 0; // Handling teens
            }

            result += units[number];
        }

        return result.trim();
    }
}

