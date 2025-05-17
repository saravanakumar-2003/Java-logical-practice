package Ques4;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();    

        int x2000 = 0, x500 = 0, x200 = 0, x100 = 0,x50 = 0, x20 = 0,x10 = 0,x5 = 0,x1 = 0;

        if(num>=2000){

            x2000 = num / 2000;
            num %= 2000;
        }

        if(num >= 500 && num <2000){

            x500 = num / 500;
            num %= 500;
        }

        if(num>=200 && num <500){
            x200 = num / 200;
            num %= 200;
        }

        if(num >= 100 && num < 200){

            x100 = num / 100;
            num %= 100;

        }

        if(num >=50 && num < 100){

            x50 = num / 50;
            num %= 50;
        }

        if(num >=20 && num < 50){
            x20 = num / 20;
            num %= 20;
        }

        if(num >=10 && num < 20){
            x10 = num / 10;
            num %= 10;
        }

        if(num >= 5 && num < 10){
            x5 = num / 5;
            num %= 5;

        }

        x1 = num;

        System.out.println("2000 : " + x2000 + "\n500 : " + x500 + "\n200 : " + x200 + "\n100 : " + x100 + "\n50 : " + x50 + "\n20 : " + x20 + "\n10 : " + x10 + "\n5 : " + x5 + "\n1 : " + x1 );
    }
    
}
