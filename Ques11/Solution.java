package Ques11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter array element " + i + ": ");
            arr[i] = in.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : arr){
            
            int factor = 0;

            for(int j=2 ; j<i ; j++){          // 2 3 4 5

                if(i%j == 0){
                    factor++;                   // 1 1 1 2
                }
            }
            hm.put(i,factor);
        }
        System.out.println(hm);

        while(!hm.isEmpty()){
           
            Entry<Integer, Integer> min = hm.entrySet().iterator().next();

            for(Entry<Integer, Integer> y : hm.entrySet()){

                if(y.getValue() < min.getValue()){
                    min = y;
                }                
            }
            System.out.print(min.getKey() + " ");
            hm.remove(min.getKey());
                
           
        }
    }
    
}
