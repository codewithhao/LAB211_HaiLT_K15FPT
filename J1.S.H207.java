package j1.s.h207;

import java.util.Scanner;


public class J1SH207 {
    static final Scanner sc = new Scanner(System.in);
    public static int secondHalfLetters(String input){
      
        //Chuan hoa String
        input = input.toLowerCase().trim();
      
        //Tach tung ki tu cua chuoi     
        String[] txt = input.split("");
        int count = 0;
      
        //Chay tu nua bang chu cai z->n
        for (char c = 'n'; c <= 'z'; c++) {
            for (int i = 0; i < txt.length; i++) {
              // Vi c la char nen phai + them "" de thanh String => equal voi txt[i]
                if(txt[i].equalsIgnoreCase(c + "")){
                    count = count + 1;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        String input = sc.nextLine();
        System.out.println(secondHalfLetters(input));
    }
    
}
