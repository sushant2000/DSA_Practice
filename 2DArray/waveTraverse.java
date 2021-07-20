import java.util.Scanner;
import java.util.Arrays;
public class waveTraverse{
 public static Scanner scn = new Scanner(System.in);

private static void column_wise_traverse(int[][] arr){
     
for(int j=0; j<arr[0].length; j++){
    if(j%2==0){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i][j] + " ");
        }
    }
        else{
            for(int i =arr.length-1;i>=0;i--)
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}



private static void row_wise_traverse(int[][] arr){
     
for(int i=0; i<arr.length; i++){
    if(i%2==0){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j] + " ");
        }
    }
        else{
            for(int j=arr[0].length-1;j>=0;j--)
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}




 public static void main(String[] args){
int n = scn.nextInt();
int m = scn.nextInt();

int[][] arr = new int[n][m];
for(int i=0;i<arr.length;i++){
    for(int j=0; j<arr[0].length;j++){
        arr[i][j]= scn.nextInt();
    }
}
        System.out.println();
        column_wise_traverse(arr);
        System.out.println();
        row_wise_traverse(arr);

 }
}