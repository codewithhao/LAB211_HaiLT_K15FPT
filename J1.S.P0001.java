package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

public class J1SP0001 {

    private static final Scanner sc = new Scanner(System.in);

    private static int checkInput() {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input <= 0) {
                    System.out.println("Please enter input > 0");
                    continue;
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number");
                System.out.print("Enter again: ");
            } catch (NegativeArraySizeException e) {
                System.out.println("Please enter number");
                System.out.print("Enter again: ");
            }
        }
    }

    private static int checkSizeArray() {
        System.out.println("Enter number of array: ");
        int n = checkInput();
        return n;
    }

    private static int[] RandomArray(int n) {
        int a[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(10);
        }
        return a;
    }

    private static void UnsortedArray(int[] a, int n) {
        System.out.print("Unsorted Array: [");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    private static void BubbleSortedArray(int[] a, int n) {
        System.out.print("Sorted Array: [");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        //Example: 5 1 4 2 8
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int n = checkSizeArray();
        int a[] = RandomArray(n);
        UnsortedArray(a, n);
        BubbleSortedArray(a, n);
    }

}
