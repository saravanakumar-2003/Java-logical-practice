package Ques7;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array element " + i + " :" );
            arr[i] = in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int count = 1;
            
            if(i==0){
                for(int j=i+1 ; j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                hm.put(arr[i], count);

            }
            else if(!hm.containsKey(arr[i])){
                for(int j=i+1 ; j<arr.length;j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                hm.put(arr[i], count);

            }
        }

        while(!hm.isEmpty()){
            int greaterKey = 0;

            int greaterValue = 0;

            for(Entry<Integer, Integer> x : hm.entrySet() ){
                if(x.getValue() > greaterValue) {
                    greaterValue = x.getValue();
                    greaterKey = x.getKey();
                }   
            }
            for(int i=0;i<greaterValue;i++){
                System.out.print(greaterKey + " ");
            }
            hm.remove(greaterKey);
        }
    }
    
}