import java.util.Scanner;
import java.util.Arrays;

public class intro{

public static Scanner scn = new Scanner(System.in);


 public static int max_element(int[] arr){
     int max = -(int)1e9;
     for(int i=0; i<arr.length;i++){
         if(arr[i]>max){
             max = arr[i];
         }
     }
     return max;
 }

 public static int min_element(int[] arr){
     int min = (int)1e9;
     for(int i=0; i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
     }
     return min;
 }

 public static int first_occur(int[] arr ,int  data){
    int  idx = -1;
     for(int i=0;i<arr.length;i++){
         if(arr[i]==data){
             idx = i;
             break;
         }
     }
     return idx;
 }

 
 public static int last_occur(int[] arr ,int  data){
    int idx = -1;
    for(int i=arr.length-1; i>=0; i--){
        if(arr[i]==data){
            idx = i;
            break;
        }
    }
    return idx;
}


public static void find_element(int[] arr, int data){
    boolean flag= false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==data){
            System.out.println("found at position " + i);
            flag =true;
        }
    }
    if(flag==false)
    System.out.println("Element not found");
}


  public static void main(String[] args){
 int n = scn.nextInt();
 int[] arr = new int[n];
 for(int i=0;i<n;i++)   arr[i]= scn.nextInt();
 int data = scn.nextInt();
 //function call
 System.out.println("MAX in Array " + max_element(arr));
 System.out.println("MIN in Array " +min_element(arr));
 System.out.println("First occurence in Array " +first_occur(arr,data));
 System.out.println("Last occurence in Array " +last_occur(arr,data));
 find_element(arr,data);
  }
}


