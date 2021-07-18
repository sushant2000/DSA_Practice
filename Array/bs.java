import java.util. Scanner;
import java.util.Arrays;

public class bs{
public static Scanner scn = new Scanner(System.in);
  

private static int binarySearch(int[] arr , int data){
    int start = 0;
    int end = arr.length-1;
    while(start <= end){
        int mid = (start + end)/2;
        if(arr[mid]<data){
            start = mid+1;
        }
        else if (arr[mid]>data){
            end = mid-1;
        }
        else
        return mid;
        }
   return -1;
    } 
    public static void main(String[] args){
        /*int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length;i++){
            arr[i]= scn.nextInt();
        }*/
         int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        //subarray(arr);
        //display(arr);
        int indx = binarySearch(arr,5);
        System.out.println("Element found at index "+ indx);
    }
}