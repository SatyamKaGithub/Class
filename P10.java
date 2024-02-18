import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to find: ");
        int elementToFind = scanner.nextInt();
        int position = findElementPosition(array, elementToFind);
        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    private static int findElementPosition(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i + 1;
            }
        }
        return -1;
    }
}