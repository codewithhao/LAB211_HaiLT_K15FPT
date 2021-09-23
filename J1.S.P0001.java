package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

public class J1SP0001 {

    private static final Scanner sc = new Scanner(System.in);

     public static int checkINP(String mess, int min, int max) {
        int input;
        do {
            try {
                System.out.print(mess);
                input = Integer.parseInt(sc.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Please Enter Again: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter again!: ");
            }
        } while (true);
    }

    private static int checkSizeArray() {
        int n = checkINP("Enter number of array: ", 1, Integer.MAX_VALUE);
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
