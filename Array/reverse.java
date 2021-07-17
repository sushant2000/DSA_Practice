import java.util. Scanner;
import java.util.Arrays;

public class reverse{
    public  static Scanner scn = new Scanner(System.in);

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
        swap(arr,i,j);
            i++;
            j--;
        }
    }

    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        reverse(arr);
        display(arr);
    }
}