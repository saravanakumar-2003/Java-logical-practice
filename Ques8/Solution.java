package Ques8;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A: ");
        String str1 = in.next();
        System.out.println("B: ");
        String str2 = in.next();

        int index = 0, count =0;

        for(int i=0;i<str1.length();i++){
            for(int j=index;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    index = j;
                    count++;
                    break;
                }
            }
        }

        if(count == str1.length()){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    
}