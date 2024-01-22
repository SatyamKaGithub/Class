import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide the radius of the circle : ");
        double radius = input.nextDouble();
        double area = (radius*radius)*3.14;
        System.out.println("Area of circle :" +area);
    }
}
