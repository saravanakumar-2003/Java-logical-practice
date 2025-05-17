package Ques9;

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

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        System.out.println("Enter arr1 size: ");
        int size1 = in.nextInt();

        System.out.println("Enter arr2 size : ");
        int size2 = in.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter element " + i + ": ");
            arr1[i] = in.nextInt();
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println("Enter element " + i + ": ");
            arr2[i] = in.nextInt();
        }


        for(int i=0;i<arr1.length;i++){

            if(arr1[i] % arr2[i] == 0){
                continue;
            }

            int prime = 0;
            int k=1;
            System.out.println("outer for loop " + i);
            for(int j=k+1;j<200;j++){
                System.out.println("Inner for loop " + j);
                if(isPrime(j)){
                    prime = j;
                    if( (arr1[i] + prime) % arr2[i] == 0){
                        System.out.println(arr1[i] + "+" + prime + "/ " + arr2[i] + " least prime = " + prime);
                        break;
                    }
                    else{
                        k=prime+1;
                    }
                }
            }                
                
            
        }
    }
    
}
