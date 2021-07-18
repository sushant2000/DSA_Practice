import java.util.Scanner;
import java.util.Arrays;

public class inverse{
    public static Scanner scn = new Scanner(System.in);

    private static int[] inverse(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            ans[arr[i]] = i;
        }
        return ans;
    }

    private static void display(int[] inv){
        for(int element : inv)
        System.out.println(element);
    }

    public static void main(String[] args){
        int n = scn.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
           arr[i] = scn.nextInt();
       }
         //int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

        int[] inv = inverse(arr);
        display(inv);
    }
}