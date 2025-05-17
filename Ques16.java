import java.util.Scanner;

public class Ques16 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] arr = {1,1,2,3,3,4,5,5};

        for(int i=0;i<arr.length;i=i+2){

            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
                i--;
            }
        }
    }
    
}
