package Ques14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = in.nextInt();

        int[] arr1 = new int[size+1];
        int[] arr2 = new int[size];

        for(int i=0;i<=size;i++){
            System.out.println("Enter element " + i + ": ");
            arr1[i] = in.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println("Enter element " + i + ": ");
            arr2[i] = in.nextInt();
        }

        try{
            for(int i=0;i<=size;i++){
                if(arr1[i] != arr2[i]){
                    System.out.println("Index: " + i);
                    break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index : " + (arr2.length) );
        }
    }
    
}
