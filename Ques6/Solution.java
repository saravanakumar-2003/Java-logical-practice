package Ques6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static int getDecimal(String binary){

        System.out.println(binary);
        int num = Integer.parseInt(binary);
        int decimal = 0;

        for(int i=0;i<binary.length();i++){
            int x = num%10;
            decimal += x * Math.pow(2, i);
            num /= 10;
            
        }
    
        return decimal;

    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter binary number: ");
        String num = in.next();

        HashMap<Integer, Character> hm = new HashMap<>();
        hm.put(10, 'A');
        hm.put(11, 'B');
        hm.put(12, 'C');
        hm.put(13, 'D');
        hm.put(14, 'E');
        hm.put(15, 'F');

        ArrayList<Integer> decimalArray = new ArrayList<>();

        for(int i=num.length();i>=0;i-=4){

            int decimal = 0;

            if(i >=4){
                decimal = getDecimal(num.substring(i-4, i));
            }
            else{
                decimal = getDecimal(num.substring(0,i));
            }
            
            decimalArray.add(decimal);

            // if(decimal <= 9){
            //     System.out.println(decimal);
            // }
            // else{
            //     System.out.println(hm.get(decimal));
            // }
        }

        for(int i=decimalArray.size()-1 ; i>=0;i--){
            if(decimalArray.get(i) <=9){
                System.out.print(decimalArray.get(i));
            }
            else{
                System.out.print(hm.get(decimalArray.get(i)));
            }
        }


    }
    
}
