import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;         // with 3rd variable
        System.out.print("Enter any two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Before Swap: " +a+ ", "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swap: " +a+ ", "+b);
    }
}
