package reviewlab203;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Reviewlab203 {
    
    private final static Scanner sc = new Scanner(System.in);
    
    public static String regex = "[a-zA-Z ]+"; //Test regex cho dung form de bai.
    
    //Check Input follow by regex
    
    public static String checkInput(String regex){
        do {            
            String txt = sc.nextLine().trim();
            if(txt.matches(regex)){
                return txt;
            }
            else{
            System.out.println("Invail Input, Pls Enter Input Again by following: " + regex);
            }
        } while (true);
    }
    
    //Function reverse parameter. 
    
    public static void printReverse(String input){
        input = input.toLowerCase().trim();
        String txt[] = input.split("\\s+");
        String output = "";
        for (int i = txt.length-1; i >= 0; i--) {
            //Duyet ki tu last
            if(i==txt.length-1){
                //UpCase ki tu dau cua chu cuoi cung.
                String first = txt[i].substring(0, 1);
                String last = txt[i].substring(1, txt[i].length());
                first = first.toUpperCase();
                String finalstring = first + last;
                output = output + finalstring + " ";            
            }else{
                output = output + " ";
            }
        }
        output = output.trim();
        System.out.println(output);
    }
    public static void main(String[] args) {
    
    printReverse(checkInput(regex));
    
    }

}
