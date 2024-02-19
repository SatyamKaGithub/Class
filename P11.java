import java.util.ArrayList;
import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements :");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements :");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] commonElements = findCommonElements(array1, array2);
        if (commonElements.length > 0) {
            System.out.print("Common elements : ");
            for (int element : commonElements) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println("No common elements found.");
        }
    }
    public static int[] findCommonElements(int[] array1, int[] array2) {
        ArrayList<Integer> commonElementsList = new ArrayList<>();
        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2 && !commonElementsList.contains(element1)) {
                    commonElementsList.add(element1);
                    break;
                }
            }
        }
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElementsArray[i] = commonElementsList.get(i);
        }
        return commonElementsArray;
    }
}

