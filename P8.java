import java.util.Scanner;
public class P8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        int highestMark = findHighestMark(marks);
        int lowestMark = findLowestMark(marks);
        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);
        scanner.close();
    }
    public static int findHighestMark(int[] marks) {
        int highest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        return highest;
    }
    public static int findLowestMark(int[] marks) {
        int lowest = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }
        return lowest;
    }
}
