package j1.s.p0020;

import java.util.Scanner;

public class J1SP0020 {

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

    private static int[] checkInputArray(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = checkInput();
        }
        return a;
    }

    private static void UnsortedArray(int a[], int n) {
        System.out.print("Unsorted Array: [");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    private static void SelectionSortedArray(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int indexmin = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indexmin]) {
                    indexmin = j;
                }
            }
            int temp = a[i];
            a[i] = a[indexmin];
            a[indexmin] = temp;
        }
        System.out.print("Sorted Array: [");
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
        int a[] = checkInputArray(n);
        UnsortedArray(a, n);
        SelectionSortedArray(a, n);
    }

}
