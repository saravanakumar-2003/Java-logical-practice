package Ques5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hexadecimal number : ");
        String str = in.next();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            switch(ch){
                
                case '0':
                    System.out.print("0000 ");
                    break;

                case '1':
                    System.out.print("0001 ");
                    break;

                case '2':
                    System.out.print("0010 ");
                    break;

                case '3':
                    System.out.print("0000 ");
                    break;

                case '4':
                    System.out.print("0100 ");
                    break;

                case '5':
                    System.out.print("0101 ");
                    break;

                case '6':
                    System.out.print("0110 ");
                    break;

                case '7':
                    System.out.print("0111 ");
                    break;

                case '8':
                    System.out.print("1000 ");
                    break;

                case '9':
                    System.out.print("1001 ");
                    break;

                case 'A':
                    System.out.print("1010 ");
                    break;

                case 'B':
                    System.out.print("1011 ");
                    break;

                case 'C':
                    System.out.print("1100 ");
                    break;

                case 'D':
                    System.out.print("1101 ");
                    break;

                case 'E':
                    System.out.print("1110 ");
                    break;

                case 'F':
                    System.out.print("1111 ");
                    break;
            }
            
        }
    }
    
}
