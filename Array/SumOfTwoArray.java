import java.util.Scanner;
import java.util.Arrays;
public class SumOfTwoArray {
    public static Scanner scn = new Scanner(System.in);

    private static void sumOfArray(int[] arr1 , int[] arr2){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int n = Math.max(i,j)+1;
        int[] arr3 = new int[n];
        int k = arr3.length-1;
        int carry=0;int sum=0;
        while(k>=0){
            sum = carry;
            if(i>=0){
            sum += arr1[i--];
            }if(j>=0){
            sum += arr2[j--];
            }

        arr3[k--] = sum % 10;
        carry = sum/10;
    }
  //  for(int val : arr3){
//          System.out.println(val + " ");
   for(int u=0;u<arr3.length;u++){
       if(u==0 && arr3[u]==0) continue;
       System.out.print(arr3[u]);
   }
    }
public static void main(String[] args){
    int n = scn.nextInt();
    int[] arr1 = new int[n];
 for(int i=0 ; i<n ;i++){
     arr1[i]= scn.nextInt();
 }
    int m = scn.nextInt();
    int[] arr2 = new int[m];

 for(int i=0 ; i<m ;i++){
     arr2[i]= scn.nextInt();
 }

sumOfArray(arr1,arr2);

}
}
