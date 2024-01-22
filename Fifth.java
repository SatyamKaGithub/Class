import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide the temperature : ");
        double tempF = input.nextDouble();
        double tempC = (tempF - 32)*(5/9);
        System.out.println(tempC);
    }
}
