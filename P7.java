import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s[] = new double[10];
        int i;
        double total = 0.0, average = 0.0;
        System.out.print("Enter any 10 sales value : ");
        for (i=0; i<10; i++){
            s[i]=input.nextDouble();
            total = total +s[i];
        }
        System.out.println("Total sales :" + total);
        average = total / 10;
        System.out.println("Average sales : " +average);
    }
}
