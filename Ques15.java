import java.util.Scanner;

public class Ques15 {
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int[] result = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter element " + i + " : ");
            arr[i] = in.nextInt();
        }                                                       // 1 2 0 4 3 0 5 0

        int index = 0;
        for(int i : arr){
            if(i != 0){
                result[index] = i;
                index++;
            }
        }

        for(int i : result){
            System.out.print(i + " ");
        }
    }

    
}
