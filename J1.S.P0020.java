package j1.s.p0020;

import java.util.Scanner;

public class J1SP0020 {

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
        int n = checkINP("Enter number of array: ",1,Integer.MAX_VALUE);
        return n;
    }

    private static int[] checkInputArray(int n) {
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = checkINP("a["+i+"]: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
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
