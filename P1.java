import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}

