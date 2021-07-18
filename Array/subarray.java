import java.util. Scanner;
import java.util.Arrays;

public class subarray{
public static Scanner scn = new Scanner(System.in);
    private static void subarray(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }
        }
    }


    public static void main(String[] args){
        /*int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= scn.nextInt();
        }*/
         int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        subarray(arr);
        //display(arr);
    }
}