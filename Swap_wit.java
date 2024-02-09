import java.util.Scanner;

public class Swap_wit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;  //without 3rd variable
        System.out.println("Enter any two numbers : ");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Before Swap : " +a+ ", " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swap: " +a+ ", " +b);

    }
}
