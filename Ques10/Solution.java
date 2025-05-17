package Ques10;

import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();

        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    
}
