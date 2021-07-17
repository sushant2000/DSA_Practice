import java.util.Scanner;
import java.util.Arrays;
public class diffOfTwoArray {
    public static Scanner scn = new Scanner(System.in);

    private static void array_diff(int[] arr1 , int[] arr2){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int[] ans = new int[i+1];
        int k = ans.length-1;
    

    int borrow = 0;
        while(k>=0){
            int num = borrow;
            if(i>=0){
                num += arr1[i--];
            }
            if(j>=0){
                num -= arr2[j--];
            }

            if(num<0){
                num = num + 10;
                borrow = -1;
            }else{
                borrow = 0;
            }

            ans[k--]= num;
        }

        boolean flag = false;
        for(int u=0; u<ans.length;u++){
            if(!flag && ans[u]==0)
            continue;

         System.out.print(ans[u]);
         flag = true;
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

array_diff(arr1,arr2);

}
}