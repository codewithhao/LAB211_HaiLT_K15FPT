package j1.s.h206;

import java.util.Scanner;

public class J1SH206 {

    static final Scanner sc = new Scanner(System.in);
    public static void printSquare(int min, int max){
        int count = 0;
        int count1 = min;
        
        for (int j = 0; j < max-count1+1; j++) {
            //In tu min -> max
            for (int i = min; i <= max; i++) {
                System.out.print(i);
                count = count + 1;

            }
            //In phan min bi thieu
            for (int i = count1; i < min; i++) {
                System.out.print(i);
                count = count + 1;
            }
            //Neu count = max thi xuong dong va reset count
            if (count == max) {
                System.out.println();
                count = 0;
            }
            //Tang min len
            min = min + 1;
        }

    }
    
// Cach cua Hoan
//        int count = min;
//        //Chay tu 0->max-count-1
//        for (int i = 0; i < max-count+1; i++) {
//            //In tu min->max
//            for (int j = min; j <= max; j++) {
//                System.out.print(j);
//            }
//            //In phan min bi thieu
//            for (int j = count; j < min; j++) {
//                System.out.print(j);
//            }
//            //Xuong dong va tang min len 1.
//            System.out.println();
//            min = min + 1;
//        }
//    }
    
    public static void main(String[] args) {
        printSquare(1,5); //
        
    }
    
}
