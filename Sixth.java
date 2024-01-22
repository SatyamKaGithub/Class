import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First number : ");
        double num1 = input.nextDouble();
        System.out.print("Second number : ");
        double num2 = input.nextDouble();
        if (num1 == num2){
            double sum = num1 + num2;
            System.out.print("Sum : " +sum);
        } else {
            double sum2 = (num1 + num2)*2;
            System.out.println(sum2);
        }
    }
}
