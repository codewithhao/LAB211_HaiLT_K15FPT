package reviewlab202;

import java.util.Scanner;
/**
 *
 * @author codewithhao
 */
public class Reviewlab202 {
    
    public static void revesercode(String input){
        //Empty thi khong chay reverse
        if(input.isEmpty()){
            return;
        }
        else
        {
        String output = "";
        for (int i = input.length()-1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println(output);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;           
        input = sc.nextLine();
        revesercode(input);     
    }
    
}
