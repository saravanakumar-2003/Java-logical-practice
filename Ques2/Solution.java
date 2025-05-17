import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter element " + i + ": ");
            arr[i] = in.nextInt();
        }

        int[] result = new int[10];

        int index = 0;
        
        for(int i : arr){

            
            while(true){

                int x = i%10;
                
                if(index == 0){
                    result[0] = x;
                    index++;
                    
                }

                
                for(int j = index - 1; j >=0 ; j--){

                    if(result[j] == x){                                             // 13,05
                        break;
                    }
                    
                    if( j == 0){
                        result[index] = x;
                        index++;
                    }
                }

                i = i/10;               // 12  1 
                if(i<=0){
                    break;
                }
                
            }
        }

        for(int i=0; i<index ; i++){
            System.out.println(result[i]);
        }
    }
}