import java.util.Scanner;
import java.util.Arrays;
public class prefixsum{
    public static Scanner scn = new Scanner(System.in);

    private static int[] prefixsumArray(int[] arr){
        int n = arr.length;
        int[] psum = new int[n+1];
        for(int i = 0; i < n; i++){
            psum[i+1] = psum[i] + arr[i]; 
        }
        return psum;
    }

    public static void resolveQuery(){
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

       int[] psum = prefixsumArray(arr);

       int query = scn.nextInt();
       while(query-- > 0){
           int start_idx = scn.nextInt();
           int end_idx = scn.nextInt();

           System.out.println(psum[end_idx + 1] - psum[start_idx]);
       }    
    }
    public static void main(String[] args){
        resolveQuery();
    }
}