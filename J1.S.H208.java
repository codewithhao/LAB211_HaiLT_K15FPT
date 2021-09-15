package j1.s.h208;

import java.util.Scanner;


public class J1SH208 {

    static final Scanner sc = new Scanner(System.in);
    
    //Lay n so phan tu nhap vao
    public static int lengthofinput(int input){
        int count = 0;
        while(input>0){
            input = input / 10;
            count = count + 1;            
        }
        return count;
    }
    //Ham swap
    public static void swapDigitPairs(int input){
       int n = lengthofinput(input);
       int a[] = new int[n];
       int i = 0;
       //Tach tung so n vao mang //Luu y: 1234 vao mang thanh -> 4321
       while(input>0){
           a[i] = input % 10;
           input = input / 10;
           i++;
       }
       
       //Swap so chan
       if(n%2==0){
        for (int j = 0; j < n; j++) {
            int temp = a[j];
            a[j] = a[j+1];
            a[j+1] = temp;
            j = j + 1;
        }
        //Swap so le
        }else
        {
           for (int j = n-2; j >=0  ; j--) {
            int temp = a[j];
            a[j] = a[j-1];
            a[j-1] = temp;
            j = j - 1;
        }
        }    
       //Xuat output    
        for (int j = a.length-1; j >= 0; j--) {
            System.out.print(a[j]);
        }  
     }
    public static void main(String[] args) {
       int input = sc.nextInt();
       swapDigitPairs(input);
       
    }
    
}
