package j1.s.h206;

import static java.lang.System.err;
import java.util.Scanner;


public class J1SH206 {

    static final Scanner sc = new Scanner(System.in);

    public static int checkINP(String mess, int min, int max) {
        int input;
        do {
            try {
                System.out.println(mess);
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

    public static void Input() {
        do {
            try {
                int min = checkINP("Enter min: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                int max = checkINP("Enter max: ", min, Integer.MAX_VALUE);
                printSquare(min, max);
                return;
            } catch (NumberFormatException ex) {
                System.out.println("You should follow input: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + " and min>max");
            }
        } while (true);
    }

    public static void printSquare(int min, int max) {
        int countmin = min;
        for (int j = 0; j <= max - countmin; j++) {
            //In tu min -> max
            for (int i = min; i <= max; i++) {
                System.out.print(i);
            }
            //In phan min bi thieu
            for (int k = countmin; k < min; k++) {
                System.out.print(k);
            }
            //Neu count = max thi xuong dong va reset count

            System.out.println();

            //Tang min len
            min = min + 1;
        }
    }

    public static void main(String[] args) {
        Input();
    }

}
