package Ques3;

import java.util.Scanner;
public class Solution {
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter array length: ");
        int size = in.nextInt();
        
        int[] arr = new int[size];
        int[] even = new int[size];
        int[] odd = new int[size];

        int oddIndex = 0, evenIndex = 0;

        for(int i=0;i<size;i++){

            System.out.println("Enter element " + i + " : ");
            arr[i] = in.nextInt();

        }

        for(int i : arr){
            if(i%2 == 0){
                if(evenIndex == 0){
                    even[0] = i;
                    evenIndex++;
                }
                else{
                    even[evenIndex] = i;
                    evenIndex++;
                }
            }
            else if(i%2 != 0){
                if(oddIndex == 0){
                    odd[0] = i;
                    oddIndex++;
                }
                else{
                    odd[oddIndex] = i;
                    oddIndex++;
                }
            }
        }

        

        for(int i=0;i<evenIndex-1;i++){

            int temp = 0;
            
            for(int j=i+1;j<evenIndex;j++){

                if(even[j] < even[i]){
                
                    temp = even[i];
                    even[i] = even[j];      // 10,20,30,40,50
                    even[j] = temp;
                }
            }
        }

        for(int i=0;i<oddIndex;i++){

            int temp = 0;
            
            for(int j=i+1;j<oddIndex;j++){

                if(odd[j] > odd[i]){
                
                    temp = odd[i];
                    odd[i] = odd[j];
                    odd[j] = temp;
                }
            }
        }

        System.out.println(oddIndex);
        
        for(int i=0;i<evenIndex;i++){
            odd[oddIndex] = even[i];
            oddIndex++;
        }



        System.out.println("final array");
        for(int i=0;i<=oddIndex-1;i++){
            System.out.print(odd[i] + "  ");
        }

        // System.out.println("even array");
        // for(int i=0;i<=evenIndex-1;i++){
        //     System.out.print(even[i] + "  ");
        // }
        

    }    
}
