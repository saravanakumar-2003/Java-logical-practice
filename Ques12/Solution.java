package Ques12;

import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int num){

        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();

        int temp = 10, num2 = 0;
        
        if(num2 == 0){
            num2 += num%10;
            num = num /10;
        }
    
        while(num != 0){

            num2 = (num2 * temp) + (num % 10);
            num = num/10;      
        }

        if(isPrime(num) && isPrime(num2)){

            System.out.println("1"); 
        }
        else{
            System.out.println("0");
        }
    }
    
}
