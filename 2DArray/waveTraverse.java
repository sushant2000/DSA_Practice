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

private static void exitPointOfMatrix(int[][] arr,int row,int col){
    int i=0, j=0,d=0;
    while(true){
        d = (d + arr[i][j]) % 4;
        if(d==0){ // start move in east col++;
             j++;
             if(j==col){
                 System.out.print(i +" "+ (j-1));
                 break;
             }
        }else if(d==1){ // start move in south row++
        i++;
             if(i==row){
                 System.out.print(i-1 +"  " +  j);
                 break;
             }

        }else if(d==2){ // start move in west col--
        j--;
             if(j==-1){
                 System.out.print(i +" "+ (j+1));
                 break;
             }

        }else{ // d=3 start move in north row--
        i--;
             if(i==-1){
                 System.out.print(i+1 +" "+ j);
                 break;
             }

        }
    }
}

private static void diagonalprint(int[][] arr){
    for(int gap=0; gap<arr[0].length;gap++){
        for(int i=0,j=gap; i<arr.length && j<arr[0].length ; i++,j++){
            System.out.print(arr[i][j]+ " ");
        }
        //System.out.println();
    }
}

private static void saddlePoint(int[][] arr){
    int row = arr.length;
    int col = arr[0].length;

    for(int r=0; r<row; r++){
        int min = (int)1e9;
        int c = 0;

    for(int j=0; j < col; j++){
        if(arr[r][j]<min){
            min = arr[r][j];
            c = j;
        }
    }
    boolean saddlepoint = true;
    for(int i = 0; i < row; i++){
        if(arr[i][c] > min){
            saddlepoint = false;
          break;
        }
    }

        if(saddlepoint==true){
         System.out.println("Saddle point " + min);
         return;
      }
    }
     System.out.println("0 Saddle point");
}

private static void searchInSortedArray(int[][] arr , int data){
    int i = arr.length-1,j=0;
    while(i>=0 && j<=arr[0].length){
        if(arr[i][j]==data){
            System.out.print(i + " "+ j);
            return;
        }
        else if(arr[i][j]<data){
            j++;
        }
        else{
            i--;
        }
    }
    System.out.println("Not Found");
}

private static void rotate90deg(int[][]arr){
    int len = arr.length;
    for(int i = 0; i < len; i++){
        for(int j = i; j < len; j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    int c1 = 0 , c2 = len-1;
    while(c1 < c2){
     for(int r = 0; r < len; r++){
         int elm1 = arr[r][c1];
         int elm2 = arr[r][c2];

         arr[r][c1] = elm2;
         arr[r][c2] = elm1;
     }
         c1++;
         c2--; 

    } 
}


public static void display(int[][]arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j]+ " ");
        }
       System.out.println();
    }
}


public static void main(String[] args){
int row = scn.nextInt();
int col = scn.nextInt();

int[][] arr = new int[row][col];
for(int i=0;i<arr.length;i++){
    for(int j=0; j<arr[0].length;j++){
        arr[i][j]= scn.nextInt();
    }
}
    //    System.out.println();
      //  column_wise_traverse(arr);
    //    System.out.println();
    //    row_wise_traverse(arr);

    //    exitPointOfMatrix(arr,row,col);
    //System.out.println();
    //diagonalprint(arr);
    //saddlePoint(arr);
  // int data = scn.nextInt();
   //searchInSortedArray(arr,data);
   System.out.println();
   rotate90deg(arr);
   display(arr);

 }
}